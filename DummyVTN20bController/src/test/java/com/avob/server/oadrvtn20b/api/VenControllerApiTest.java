/*
 * Avob VTN Rest API
 * Description
 *
 * OpenAPI spec version: API TOS
 * Contact: bzanni@avob.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.avob.server.oadrvtn20b.api;

import com.avob.server.oadrvtn20b.handler.ApiException;
import com.avob.server.oadrvtn20b.model.InputStreamResource;
import com.avob.server.oadrvtn20b.model.VenCreateDto;
import com.avob.server.oadrvtn20b.model.VenDto;
import com.avob.server.oadrvtn20b.model.VenFilter;
import com.avob.server.oadrvtn20b.model.VenGroupDto;
import com.avob.server.oadrvtn20b.model.VenMarketContextDto;
import com.avob.server.oadrvtn20b.model.VenResourceDto;
import com.avob.server.oadrvtn20b.model.VenUpdateDto;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for VenControllerApi
 */
@Ignore
public class VenControllerApiTest {

    private final VenControllerApi api = new VenControllerApi();

    
    /**
     * addGroupToVen
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addGroupToVenUsingPOSTTest() throws ApiException {
        Long groupId = null;
        String venID = null;
        VenCreateDto response = api.addGroupToVenUsingPOST(groupId, venID);

        // TODO: test validations
    }
    
    /**
     * addMarketContextToVen
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addMarketContextToVenUsingPOSTTest() throws ApiException {
        Long marketContextId = null;
        String venID = null;
        VenCreateDto response = api.addMarketContextToVenUsingPOST(marketContextId, venID);

        // TODO: test validations
    }
    
    /**
     * cleanRegistration
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cleanRegistrationUsingPOSTTest() throws ApiException {
        String venID = null;
        api.cleanRegistrationUsingPOST(venID);

        // TODO: test validations
    }
    
    /**
     * createVenResource
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createVenResourceUsingPOSTTest() throws ApiException {
        VenResourceDto dto = null;
        String venID = null;
        VenResourceDto response = api.createVenResourceUsingPOST(dto, venID);

        // TODO: test validations
    }
    
    /**
     * createVen
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createVenUsingPOSTTest() throws ApiException {
        VenCreateDto dto = null;
        InputStreamResource response = api.createVenUsingPOST(dto);

        // TODO: test validations
    }
    
    /**
     * deleteVenByUsername
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteVenByUsernameUsingDELETETest() throws ApiException {
        String venID = null;
        api.deleteVenByUsernameUsingDELETE(venID);

        // TODO: test validations
    }
    
    /**
     * deleteVenGroup
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteVenGroupUsingPOSTTest() throws ApiException {
        Long groupId = null;
        String venID = null;
        api.deleteVenGroupUsingPOST(groupId, venID);

        // TODO: test validations
    }
    
    /**
     * deleteVenMarketContext
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteVenMarketContextUsingPOSTTest() throws ApiException {
        Long marketContextId = null;
        String venID = null;
        api.deleteVenMarketContextUsingPOST(marketContextId, venID);

        // TODO: test validations
    }
    
    /**
     * deleteVenResource
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteVenResourceUsingDELETETest() throws ApiException {
        String resourceName = null;
        String venID = null;
        api.deleteVenResourceUsingDELETE(resourceName, venID);

        // TODO: test validations
    }
    
    /**
     * findVenByUsername
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findVenByUsernameUsingGETTest() throws ApiException {
        String venID = null;
        VenDto response = api.findVenByUsernameUsingGET(venID);

        // TODO: test validations
    }
    
    /**
     * listVenGroup
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listVenGroupUsingGETTest() throws ApiException {
        String venID = null;
        List<VenGroupDto> response = api.listVenGroupUsingGET(venID);

        // TODO: test validations
    }
    
    /**
     * listVenMarketContext
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listVenMarketContextUsingGETTest() throws ApiException {
        String venID = null;
        List<VenMarketContextDto> response = api.listVenMarketContextUsingGET(venID);

        // TODO: test validations
    }
    
    /**
     * listVenResource
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listVenResourceUsingGETTest() throws ApiException {
        String venID = null;
        List<VenResourceDto> response = api.listVenResourceUsingGET(venID);

        // TODO: test validations
    }
    
    /**
     * listVen
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listVenUsingGETTest() throws ApiException {
        List<VenDto> response = api.listVenUsingGET();

        // TODO: test validations
    }
    
    /**
     * searchVen
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void searchVenUsingPOSTTest() throws ApiException {
        List<VenFilter> filters = null;
        Integer page = null;
        Integer size = null;
        List<VenDto> response = api.searchVenUsingPOST(filters, page, size);

        // TODO: test validations
    }
    
    /**
     * updateVen
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateVenUsingPUTTest() throws ApiException {
        VenUpdateDto dto = null;
        String venID = null;
        VenCreateDto response = api.updateVenUsingPUT(dto, venID);

        // TODO: test validations
    }
    
}
