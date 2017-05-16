## Camera Homework

A photographer wants to manage her collection of cameras. She also wants to be able to print the specs of all of her cameras and keep a journal of how many photos she took each day.

  - Implement a Photographer class that has an ArrayList of cameras
    - Create addCamera and removeCamera methods 
      - Create a Printable interface that has one method - printDetails
        - Create a DigitalCamera class and an AnalogCamera class that implement the Printable interface
          - Give the Photographer the ablity to print out all the details of her camera collection. The class should have a method that returns a String of all the camera details. 
            
              E.G
                  1. Nikon 34T, Noise reduction filter, Hi-resolution
                      2. Sony ILCE5100L, No noise reduciton, Lo-resolution

                        Extension:
                           -  Add a HashMap "journal" to the Photographer that represents how many photographs they've taken per day. Add a numberOfPhotos method that returns how many photos they've taken.
                             
                               Remember:
                                  - The implementation of the method should be in the implementing classes not the interface
                                     - Use a TDD approach - tests first
                                        - Commit to Git
