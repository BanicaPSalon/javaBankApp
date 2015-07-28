/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Genelou
 */
// Java core packages
 import java.io.*;

public class RandomAccessAccountRecord extends AccountRecord {
 // no-argument constructor calls other constructor
 // with default values
 public RandomAccessAccountRecord()
 {
 this( 0, "", "", "", 0.0 );
 }

 // initialize a RandomAccessAccountRecord
 public RandomAccessAccountRecord( int account, String firstName, String middleName, String lastName, double balance )
 {
 super( account, firstName, firstName, lastName, balance );
 }

 // read a record from specified RandomAccessFile
 public void read( RandomAccessFile file ) throws IOException
 {
 setAccount( file.readInt() );
 setFname( padName( file ) );
 setMname( padName( file ) );
 setLname( padName( file ) );
 setBalance( file.readDouble() );
 }
 // ensure that name is proper length
 private String padName( RandomAccessFile file )
 throws IOException
 {
 char name[] = new char[ 15 ], temp;

 for ( int count = 0; count < name.length; count++ ) {
 temp = file.readChar();
 name[ count ] = temp;
 }

 return new String( name ).replace( '\0', ' ' );
 }

 // write a record to specified RandomAccessFile
 public void write( RandomAccessFile file ) throws IOException
 {
 file.writeInt( getAccount() );
 writeName( file, getFname() );
 writeName( file, getMname() );
 writeName( file, getLname() );
 file.writeDouble( getBalance() );
 }

 // write a name to file; maximum of 15 characters
 private void writeName( RandomAccessFile file, String name )
 throws IOException
 {
 StringBuffer buffer = null;

 if ( name != null )
 buffer = new StringBuffer( name );
 else
 buffer = new StringBuffer( 15 );

 buffer.setLength( 15 );
 file.writeChars( buffer.toString() );
 }

 // NOTE: This method contains a hard coded value for the
 // size of a record of information.
 public static int size()
 {
 return 72;
 }

 } // end class RandomAccessAccountRecord
