package com.nabobery.sdkgen.generated.stripe.entitlements

import com.nabobery.sdkgen.generated.stripe.EntitlementsActiveEntitlement
import com.nabobery.sdkgen.generated.stripe.EntitlementsFeature
import com.nabobery.sdkgen.generated.stripe.Error
import com.nabobery.sdkgen.generated.stripe.InlineV1EntitlementsActiveEntitlementsGetResponse200JsonX6fcf54bc
import com.nabobery.sdkgen.generated.stripe.InlineV1EntitlementsFeaturesGetResponse200JsonXb2e0222c
import com.nabobery.sdkgen.generated.stripe.InlineV1EntitlementsFeaturesPostRequestFormX3fbc6c94
import com.nabobery.sdkgen.generated.stripe.InlineV1EntitlementsFeaturesPostRequestFormX7e1f7d8d
import com.nabobery.sdkgen.generated.stripe.SdkJson
import com.nabobery.sdkgen.runtime.BackoffHints
import com.nabobery.sdkgen.runtime.CallOptions
import com.nabobery.sdkgen.runtime.KotlinxSerializationCodec
import com.nabobery.sdkgen.runtime.MediaTypeCodec
import com.nabobery.sdkgen.runtime.MediaTypeCodecRegistry
import com.nabobery.sdkgen.runtime.OperationMetadata
import com.nabobery.sdkgen.runtime.OperationSafety
import com.nabobery.sdkgen.runtime.ResponseAlternative
import com.nabobery.sdkgen.runtime.ResponseSelector
import com.nabobery.sdkgen.runtime.RetryDescriptor
import com.nabobery.sdkgen.runtime.SdkAuthentication
import com.nabobery.sdkgen.runtime.SdkByteStream
import com.nabobery.sdkgen.runtime.SdkDeadlines
import com.nabobery.sdkgen.runtime.SdkExecutionRequest
import com.nabobery.sdkgen.runtime.SdkExecutor
import com.nabobery.sdkgen.runtime.SdkHeader
import com.nabobery.sdkgen.runtime.SdkParameterLocation
import com.nabobery.sdkgen.runtime.SdkRequestBody
import com.nabobery.sdkgen.runtime.SdkRequestParameter
import com.nabobery.sdkgen.runtime.SdkResponseAlternativeDecoder
import com.nabobery.sdkgen.runtime.SdkResponseDecodeResult
import com.nabobery.sdkgen.runtime.SdkResponseMode
import com.nabobery.sdkgen.runtime.SdkResponseResult
import com.nabobery.sdkgen.runtime.SdkTransport
import com.nabobery.sdkgen.runtime.SecurityRequirement
import com.nabobery.sdkgen.runtime.SecuritySchemeRef
import com.nabobery.sdkgen.runtime.auth.CredentialProvider
import com.nabobery.sdkgen.runtime.auth.SecurityScheme
import com.nabobery.sdkgen.runtime.auth.SecuritySchemeAuthentication
import com.nabobery.sdkgen.runtime.auth.SecuritySchemeBinding
import com.nabobery.sdkgen.runtime.auth.TrustedHosts
import com.nabobery.sdkgen.runtime.bodies.FormUrlEncodedBody
import kotlin.Boolean
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.collections.Set
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive

public object EntitlementsCodecs {
  public const val GETENTITLEMENTSACTIVEENTITLEMENTS_REQUEST_CODEC_ID: String =
      "GetEntitlementsActiveEntitlements.request"

  private val getEntitlementsActiveEntitlementsRequestCodec: MediaTypeCodec<JsonObject?> =
      GetEntitlementsActiveEntitlementsFormCodec

  private val getEntitlementsActiveEntitlementsResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1EntitlementsActiveEntitlementsGetResponse200JsonX6fcf54bc> =
      KotlinxSerializationCodec("GetEntitlementsActiveEntitlements.response.alternative0", InlineV1EntitlementsActiveEntitlementsGetResponse200JsonX6fcf54bc.Serializer, SdkJson)

  public val getEntitlementsActiveEntitlementsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1EntitlementsActiveEntitlementsGetResponse200JsonX6fcf54bc> =
      MediaTypeCodecRegistry.of(getEntitlementsActiveEntitlementsResponseCodecAlternative0Codec)

  private val getEntitlementsActiveEntitlementsResponseCodecAlternative1Codec: MediaTypeCodec<Error>
      =
      KotlinxSerializationCodec("GetEntitlementsActiveEntitlements.response.alternative1", Error.Serializer, SdkJson)

  public val getEntitlementsActiveEntitlementsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getEntitlementsActiveEntitlementsResponseCodecAlternative1Codec)

  public val getEntitlementsActiveEntitlementsRequestCodecRegistry:
      MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getEntitlementsActiveEntitlementsRequestCodec)

  public const val GETENTITLEMENTSACTIVEENTITLEMENTSID_REQUEST_CODEC_ID: String =
      "GetEntitlementsActiveEntitlementsId.request"

  private val getEntitlementsActiveEntitlementsIdRequestCodec: MediaTypeCodec<JsonObject?> =
      GetEntitlementsActiveEntitlementsIdFormCodec

  private val getEntitlementsActiveEntitlementsIdResponseCodecAlternative0Codec:
      MediaTypeCodec<EntitlementsActiveEntitlement> =
      KotlinxSerializationCodec("GetEntitlementsActiveEntitlementsId.response.alternative0", EntitlementsActiveEntitlement.Serializer, SdkJson)

  public val getEntitlementsActiveEntitlementsIdResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<EntitlementsActiveEntitlement> =
      MediaTypeCodecRegistry.of(getEntitlementsActiveEntitlementsIdResponseCodecAlternative0Codec)

  private val getEntitlementsActiveEntitlementsIdResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetEntitlementsActiveEntitlementsId.response.alternative1", Error.Serializer, SdkJson)

  public val getEntitlementsActiveEntitlementsIdResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getEntitlementsActiveEntitlementsIdResponseCodecAlternative1Codec)

  public val getEntitlementsActiveEntitlementsIdRequestCodecRegistry:
      MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getEntitlementsActiveEntitlementsIdRequestCodec)

  public const val GETENTITLEMENTSFEATURES_REQUEST_CODEC_ID: String =
      "GetEntitlementsFeatures.request"

  private val getEntitlementsFeaturesRequestCodec: MediaTypeCodec<JsonObject?> =
      GetEntitlementsFeaturesFormCodec

  private val getEntitlementsFeaturesResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1EntitlementsFeaturesGetResponse200JsonXb2e0222c> =
      KotlinxSerializationCodec("GetEntitlementsFeatures.response.alternative0", InlineV1EntitlementsFeaturesGetResponse200JsonXb2e0222c.Serializer, SdkJson)

  public val getEntitlementsFeaturesResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1EntitlementsFeaturesGetResponse200JsonXb2e0222c> =
      MediaTypeCodecRegistry.of(getEntitlementsFeaturesResponseCodecAlternative0Codec)

  private val getEntitlementsFeaturesResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetEntitlementsFeatures.response.alternative1", Error.Serializer, SdkJson)

  public val getEntitlementsFeaturesResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error>
      = MediaTypeCodecRegistry.of(getEntitlementsFeaturesResponseCodecAlternative1Codec)

  public val getEntitlementsFeaturesRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getEntitlementsFeaturesRequestCodec)

  public const val GETENTITLEMENTSFEATURESID_REQUEST_CODEC_ID: String =
      "GetEntitlementsFeaturesId.request"

  private val getEntitlementsFeaturesIdRequestCodec: MediaTypeCodec<JsonObject?> =
      GetEntitlementsFeaturesIdFormCodec

  private val getEntitlementsFeaturesIdResponseCodecAlternative0Codec:
      MediaTypeCodec<EntitlementsFeature> =
      KotlinxSerializationCodec("GetEntitlementsFeaturesId.response.alternative0", EntitlementsFeature.Serializer, SdkJson)

  public val getEntitlementsFeaturesIdResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<EntitlementsFeature> =
      MediaTypeCodecRegistry.of(getEntitlementsFeaturesIdResponseCodecAlternative0Codec)

  private val getEntitlementsFeaturesIdResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetEntitlementsFeaturesId.response.alternative1", Error.Serializer, SdkJson)

  public val getEntitlementsFeaturesIdResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getEntitlementsFeaturesIdResponseCodecAlternative1Codec)

  public val getEntitlementsFeaturesIdRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getEntitlementsFeaturesIdRequestCodec)

  public const val POSTENTITLEMENTSFEATURES_REQUEST_CODEC_ID: String =
      "PostEntitlementsFeatures.request"

  private val postEntitlementsFeaturesRequestCodec:
      MediaTypeCodec<InlineV1EntitlementsFeaturesPostRequestFormX7e1f7d8d> =
      PostEntitlementsFeaturesFormCodec

  private val postEntitlementsFeaturesResponseCodecAlternative0Codec:
      MediaTypeCodec<EntitlementsFeature> =
      KotlinxSerializationCodec("PostEntitlementsFeatures.response.alternative0", EntitlementsFeature.Serializer, SdkJson)

  public val postEntitlementsFeaturesResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<EntitlementsFeature> =
      MediaTypeCodecRegistry.of(postEntitlementsFeaturesResponseCodecAlternative0Codec)

  private val postEntitlementsFeaturesResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostEntitlementsFeatures.response.alternative1", Error.Serializer, SdkJson)

  public val postEntitlementsFeaturesResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postEntitlementsFeaturesResponseCodecAlternative1Codec)

  public val postEntitlementsFeaturesRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1EntitlementsFeaturesPostRequestFormX7e1f7d8d> =
      MediaTypeCodecRegistry.of(postEntitlementsFeaturesRequestCodec)

  public const val POSTENTITLEMENTSFEATURESID_REQUEST_CODEC_ID: String =
      "PostEntitlementsFeaturesId.request"

  private val postEntitlementsFeaturesIdRequestCodec:
      MediaTypeCodec<InlineV1EntitlementsFeaturesPostRequestFormX3fbc6c94?> =
      PostEntitlementsFeaturesIdFormCodec

  private val postEntitlementsFeaturesIdResponseCodecAlternative0Codec:
      MediaTypeCodec<EntitlementsFeature> =
      KotlinxSerializationCodec("PostEntitlementsFeaturesId.response.alternative0", EntitlementsFeature.Serializer, SdkJson)

  public val postEntitlementsFeaturesIdResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<EntitlementsFeature> =
      MediaTypeCodecRegistry.of(postEntitlementsFeaturesIdResponseCodecAlternative0Codec)

  private val postEntitlementsFeaturesIdResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostEntitlementsFeaturesId.response.alternative1", Error.Serializer, SdkJson)

  public val postEntitlementsFeaturesIdResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postEntitlementsFeaturesIdResponseCodecAlternative1Codec)

  public val postEntitlementsFeaturesIdRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1EntitlementsFeaturesPostRequestFormX3fbc6c94?> =
      MediaTypeCodecRegistry.of(postEntitlementsFeaturesIdRequestCodec)

  public object GetEntitlementsActiveEntitlementsFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetEntitlementsActiveEntitlements.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: JsonObject?, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): JsonObject? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  public object GetEntitlementsActiveEntitlementsIdFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetEntitlementsActiveEntitlementsId.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: JsonObject?, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): JsonObject? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  public object GetEntitlementsFeaturesFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetEntitlementsFeatures.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: JsonObject?, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): JsonObject? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  public object GetEntitlementsFeaturesIdFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetEntitlementsFeaturesId.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: JsonObject?, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): JsonObject? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  public object PostEntitlementsFeaturesFormCodec : MediaTypeCodec<InlineV1EntitlementsFeaturesPostRequestFormX7e1f7d8d> {
    override val id: String = "PostEntitlementsFeatures.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1EntitlementsFeaturesPostRequestFormX7e1f7d8d, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      request.expand?.let { formValue0 ->
        if (formValue0.isEmpty()) {
          form.add("expand", "")
        } else {
          formValue0.forEachIndexed { formIndex1, formElement1 ->
            form.add("expand" + "[" + formIndex1 + "]", formElement1)
          }
        }
      }
      form.add("lookup_key", request.lookupKey)
      request.metadata?.let { formValue0 ->
        formValue0.forEach { (formKey1, formMapValue1) ->
          form.add("metadata" + "[" + formKey1 + "]", formMapValue1)
        }
      }
      form.add("name", request.name)
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1EntitlementsFeaturesPostRequestFormX7e1f7d8d {
      error("Form request codecs do not decode response bodies.")
    }
  }

  public object PostEntitlementsFeaturesIdFormCodec : MediaTypeCodec<InlineV1EntitlementsFeaturesPostRequestFormX3fbc6c94?> {
    override val id: String = "PostEntitlementsFeaturesId.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1EntitlementsFeaturesPostRequestFormX3fbc6c94?, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      request.active?.let { formValue0 ->
        form.add("active", formValue0.toString())
      }
      request.expand?.let { formValue0 ->
        if (formValue0.isEmpty()) {
          form.add("expand", "")
        } else {
          formValue0.forEachIndexed { formIndex1, formElement1 ->
            form.add("expand" + "[" + formIndex1 + "]", formElement1)
          }
        }
      }
      request.metadata?.let { formValue0 ->
        require(formValue0.matchedBranches.size == 1) { "Form union value must match exactly one wire-kind branch" }
        when {
          formValue0.branch1 != null -> {
            requireNotNull(formValue0.branch1).forEach { (formKey2, formMapValue2) ->
              val formPrimitive2 = formMapValue2 as? JsonPrimitive ?: error("Form map values encoded from a raw JSON object must be JSON primitives")
              form.add("metadata" + "[" + formKey2 + "]", formPrimitive2.content)
            }
          }
          formValue0.inlineV1EntitlementsFeaturesPostRequestFormMetadataAnyOf2Xdfe02695 != null -> {
            form.add("metadata", requireNotNull(formValue0.inlineV1EntitlementsFeaturesPostRequestFormMetadataAnyOf2Xdfe02695).value)
          }
          else -> {
            error("Form union value has no selected branch")
          }
        }
      }
      request.name?.let { formValue0 ->
        form.add("name", formValue0)
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1EntitlementsFeaturesPostRequestFormX3fbc6c94? {
      error("Form request codecs do not decode response bodies.")
    }
  }
}

/**
 * Client for the 'entitlements' group of Stripe API.
 */
public class EntitlementsClient(
  transport: SdkTransport,
  private val baseUri: String,
  credentialProviders: Map<String, CredentialProvider> = emptyMap(),
  trustedHosts: TrustedHosts? = null,
  authentication: SdkAuthentication? = null,
) {
  private val contractSecuritySchemes: Map<String, SecurityScheme> = mapOf(
        "basicAuth" to SecurityScheme.HttpBasic,
        "bearerAuth" to SecurityScheme.HttpBearer(),
      )

  private val authentication: SdkAuthentication? = authentication ?: SecuritySchemeAuthentication(
        bindings =
          contractSecuritySchemes.mapNotNull { (schemeId, scheme) ->
            credentialProviders[schemeId]?.let { provider -> schemeId to SecuritySchemeBinding(scheme, provider) }
          }.toMap(),
        trustedHosts = trustedHosts ?: TrustedHosts.of(baseUri),
      )

  private val executor: SdkExecutor =
      SdkExecutor(transport, authentication = this@EntitlementsClient.authentication)

  /**
   * <p>Retrieve a list of active entitlements for a customer</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param customer The ID of the customer.
   * @param endingBefore A cursor for use in pagination. `ending_before` is an object ID that defines your place in the
   * list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent
   * call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
   * @param expand Specifies which fields in the response should be expanded.
   * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is
   * 10.
   * @param startingAfter A cursor for use in pagination. `starting_after` is an object ID that defines your place in
   * the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent
   * call can include `starting_after=obj_foo` in order to fetch the next page of the list.
   * @param options Execution options.
   */
  public suspend fun getEntitlementsActiveEntitlementsWithResponse(
    request: JsonObject? = null,
    customer: String,
    endingBefore: String? = null,
    expand: List<String>? = null,
    limit: Int? = null,
    startingAfter: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetEntitlementsActiveEntitlementsResponse> = executor.executeWithResponse<JsonObject?, GetEntitlementsActiveEntitlementsResponse>(SdkExecutionRequest(getEntitlementsActiveEntitlementsMetadata, baseUri, request, listOf(EntitlementsCodecs.GETENTITLEMENTSACTIVEENTITLEMENTS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "customer", values = listOf(customer.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "ending_before", values = endingBefore?.let { listOf(it.toString()) }.orEmpty()))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "starting_after", values = startingAfter?.let { listOf(it.toString()) }.orEmpty()))
  }), EntitlementsCodecs.getEntitlementsActiveEntitlementsRequestCodecRegistry, GetEntitlementsActiveEntitlementsResponseDecoder, options)

  /**
   * <p>Retrieve an active entitlement</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param id The ID of the entitlement.
   * @param expand Specifies which fields in the response should be expanded.
   * @param options Execution options.
   */
  public suspend fun getEntitlementsActiveEntitlementsIdWithResponse(
    request: JsonObject? = null,
    id: String,
    expand: List<String>? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetEntitlementsActiveEntitlementsIdResponse> = executor.executeWithResponse<JsonObject?, GetEntitlementsActiveEntitlementsIdResponse>(SdkExecutionRequest(getEntitlementsActiveEntitlementsIdMetadata, baseUri, request, listOf(EntitlementsCodecs.GETENTITLEMENTSACTIVEENTITLEMENTSID_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
  }), EntitlementsCodecs.getEntitlementsActiveEntitlementsIdRequestCodecRegistry, GetEntitlementsActiveEntitlementsIdResponseDecoder, options)

  /**
   * <p>Retrieve a list of features</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param archived If set, filter results to only include features with the given archive status.
   * @param endingBefore A cursor for use in pagination. `ending_before` is an object ID that defines your place in the
   * list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent
   * call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
   * @param expand Specifies which fields in the response should be expanded.
   * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is
   * 10.
   * @param lookupKey If set, filter results to only include features with the given lookup_key.
   * @param startingAfter A cursor for use in pagination. `starting_after` is an object ID that defines your place in
   * the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent
   * call can include `starting_after=obj_foo` in order to fetch the next page of the list.
   * @param options Execution options.
   */
  public suspend fun getEntitlementsFeaturesWithResponse(
    request: JsonObject? = null,
    archived: Boolean? = null,
    endingBefore: String? = null,
    expand: List<String>? = null,
    limit: Int? = null,
    lookupKey: String? = null,
    startingAfter: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetEntitlementsFeaturesResponse> = executor.executeWithResponse<JsonObject?, GetEntitlementsFeaturesResponse>(SdkExecutionRequest(getEntitlementsFeaturesMetadata, baseUri, request, listOf(EntitlementsCodecs.GETENTITLEMENTSFEATURES_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "archived", values = archived?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "ending_before", values = endingBefore?.let { listOf(it.toString()) }.orEmpty()))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "lookup_key", values = lookupKey?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "starting_after", values = startingAfter?.let { listOf(it.toString()) }.orEmpty()))
  }), EntitlementsCodecs.getEntitlementsFeaturesRequestCodecRegistry, GetEntitlementsFeaturesResponseDecoder, options)

  /**
   * <p>Retrieves a feature</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param id The ID of the feature.
   * @param expand Specifies which fields in the response should be expanded.
   * @param options Execution options.
   */
  public suspend fun getEntitlementsFeaturesIdWithResponse(
    request: JsonObject? = null,
    id: String,
    expand: List<String>? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetEntitlementsFeaturesIdResponse> = executor.executeWithResponse<JsonObject?, GetEntitlementsFeaturesIdResponse>(SdkExecutionRequest(getEntitlementsFeaturesIdMetadata, baseUri, request, listOf(EntitlementsCodecs.GETENTITLEMENTSFEATURESID_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
  }), EntitlementsCodecs.getEntitlementsFeaturesIdRequestCodecRegistry, GetEntitlementsFeaturesIdResponseDecoder, options)

  /**
   * <p>Creates a feature</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param options Execution options.
   */
  public suspend fun postEntitlementsFeaturesWithResponse(request: InlineV1EntitlementsFeaturesPostRequestFormX7e1f7d8d, options: CallOptions = CallOptions()): SdkResponseResult<PostEntitlementsFeaturesResponse> = executor.executeWithResponse<InlineV1EntitlementsFeaturesPostRequestFormX7e1f7d8d, PostEntitlementsFeaturesResponse>(SdkExecutionRequest(postEntitlementsFeaturesMetadata, baseUri, request, listOf(EntitlementsCodecs.POSTENTITLEMENTSFEATURES_REQUEST_CODEC_ID), emptyList()), EntitlementsCodecs.postEntitlementsFeaturesRequestCodecRegistry, PostEntitlementsFeaturesResponseDecoder, options)

  /**
   * <p>Update a feature’s metadata or permanently deactivate it.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param id Wire parameter `id`.
   * @param options Execution options.
   */
  public suspend fun postEntitlementsFeaturesIdWithResponse(
    request: InlineV1EntitlementsFeaturesPostRequestFormX3fbc6c94? = null,
    id: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostEntitlementsFeaturesIdResponse> = executor.executeWithResponse<InlineV1EntitlementsFeaturesPostRequestFormX3fbc6c94?, PostEntitlementsFeaturesIdResponse>(SdkExecutionRequest(postEntitlementsFeaturesIdMetadata, baseUri, request, listOf(EntitlementsCodecs.POSTENTITLEMENTSFEATURESID_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
  }), EntitlementsCodecs.postEntitlementsFeaturesIdRequestCodecRegistry, PostEntitlementsFeaturesIdResponseDecoder, options)

  /**
   * Typed response alternatives for `GetEntitlementsActiveEntitlements`. Non-success alternatives are not converted
   * into success values.
   */
  public sealed interface GetEntitlementsActiveEntitlementsResponse {
    public class SuccessJson(
      public val json: InlineV1EntitlementsActiveEntitlementsGetResponse200JsonX6fcf54bc,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetEntitlementsActiveEntitlementsResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetEntitlementsActiveEntitlementsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetEntitlementsActiveEntitlementsResponse
  }

  private object GetEntitlementsActiveEntitlementsResponseDecoder : SdkResponseAlternativeDecoder<GetEntitlementsActiveEntitlementsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetEntitlementsActiveEntitlementsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetEntitlementsActiveEntitlementsResponse> = when {
      alternative.id == "GetEntitlementsActiveEntitlements.response.alternative0" -> SdkResponseDecodeResult(
        value = GetEntitlementsActiveEntitlementsResponse.SuccessJson(
          json = EntitlementsCodecs.getEntitlementsActiveEntitlementsResponseCodecAlternative0Registry.select(listOf("GetEntitlementsActiveEntitlements.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetEntitlementsActiveEntitlements.response.alternative1" -> SdkResponseDecodeResult(
        value = GetEntitlementsActiveEntitlementsResponse.DefaultJson(
          json = EntitlementsCodecs.getEntitlementsActiveEntitlementsResponseCodecAlternative1Registry.select(listOf("GetEntitlementsActiveEntitlements.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      else -> error("No generated response decoder matched the selected response alternative.")
    }

    public override suspend fun decodeUnknown(
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
    ): GetEntitlementsActiveEntitlementsResponse = GetEntitlementsActiveEntitlementsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetEntitlementsActiveEntitlementsId`. Non-success alternatives are not converted
   * into success values.
   */
  public sealed interface GetEntitlementsActiveEntitlementsIdResponse {
    public class SuccessJson(
      public val json: EntitlementsActiveEntitlement,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetEntitlementsActiveEntitlementsIdResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetEntitlementsActiveEntitlementsIdResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetEntitlementsActiveEntitlementsIdResponse
  }

  private object GetEntitlementsActiveEntitlementsIdResponseDecoder : SdkResponseAlternativeDecoder<GetEntitlementsActiveEntitlementsIdResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetEntitlementsActiveEntitlementsIdResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetEntitlementsActiveEntitlementsIdResponse> = when {
      alternative.id == "GetEntitlementsActiveEntitlementsId.response.alternative0" -> SdkResponseDecodeResult(
        value = GetEntitlementsActiveEntitlementsIdResponse.SuccessJson(
          json = EntitlementsCodecs.getEntitlementsActiveEntitlementsIdResponseCodecAlternative0Registry.select(listOf("GetEntitlementsActiveEntitlementsId.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetEntitlementsActiveEntitlementsId.response.alternative1" -> SdkResponseDecodeResult(
        value = GetEntitlementsActiveEntitlementsIdResponse.DefaultJson(
          json = EntitlementsCodecs.getEntitlementsActiveEntitlementsIdResponseCodecAlternative1Registry.select(listOf("GetEntitlementsActiveEntitlementsId.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      else -> error("No generated response decoder matched the selected response alternative.")
    }

    public override suspend fun decodeUnknown(
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
    ): GetEntitlementsActiveEntitlementsIdResponse = GetEntitlementsActiveEntitlementsIdResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetEntitlementsFeatures`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface GetEntitlementsFeaturesResponse {
    public class SuccessJson(
      public val json: InlineV1EntitlementsFeaturesGetResponse200JsonXb2e0222c,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetEntitlementsFeaturesResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetEntitlementsFeaturesResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetEntitlementsFeaturesResponse
  }

  private object GetEntitlementsFeaturesResponseDecoder : SdkResponseAlternativeDecoder<GetEntitlementsFeaturesResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetEntitlementsFeaturesResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetEntitlementsFeaturesResponse> = when {
      alternative.id == "GetEntitlementsFeatures.response.alternative0" -> SdkResponseDecodeResult(
        value = GetEntitlementsFeaturesResponse.SuccessJson(
          json = EntitlementsCodecs.getEntitlementsFeaturesResponseCodecAlternative0Registry.select(listOf("GetEntitlementsFeatures.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetEntitlementsFeatures.response.alternative1" -> SdkResponseDecodeResult(
        value = GetEntitlementsFeaturesResponse.DefaultJson(
          json = EntitlementsCodecs.getEntitlementsFeaturesResponseCodecAlternative1Registry.select(listOf("GetEntitlementsFeatures.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      else -> error("No generated response decoder matched the selected response alternative.")
    }

    public override suspend fun decodeUnknown(
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
    ): GetEntitlementsFeaturesResponse = GetEntitlementsFeaturesResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetEntitlementsFeaturesId`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface GetEntitlementsFeaturesIdResponse {
    public class SuccessJson(
      public val json: EntitlementsFeature,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetEntitlementsFeaturesIdResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetEntitlementsFeaturesIdResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetEntitlementsFeaturesIdResponse
  }

  private object GetEntitlementsFeaturesIdResponseDecoder : SdkResponseAlternativeDecoder<GetEntitlementsFeaturesIdResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetEntitlementsFeaturesIdResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetEntitlementsFeaturesIdResponse> = when {
      alternative.id == "GetEntitlementsFeaturesId.response.alternative0" -> SdkResponseDecodeResult(
        value = GetEntitlementsFeaturesIdResponse.SuccessJson(
          json = EntitlementsCodecs.getEntitlementsFeaturesIdResponseCodecAlternative0Registry.select(listOf("GetEntitlementsFeaturesId.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetEntitlementsFeaturesId.response.alternative1" -> SdkResponseDecodeResult(
        value = GetEntitlementsFeaturesIdResponse.DefaultJson(
          json = EntitlementsCodecs.getEntitlementsFeaturesIdResponseCodecAlternative1Registry.select(listOf("GetEntitlementsFeaturesId.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      else -> error("No generated response decoder matched the selected response alternative.")
    }

    public override suspend fun decodeUnknown(
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
    ): GetEntitlementsFeaturesIdResponse = GetEntitlementsFeaturesIdResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostEntitlementsFeatures`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface PostEntitlementsFeaturesResponse {
    public class SuccessJson(
      public val json: EntitlementsFeature,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostEntitlementsFeaturesResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostEntitlementsFeaturesResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostEntitlementsFeaturesResponse
  }

  private object PostEntitlementsFeaturesResponseDecoder : SdkResponseAlternativeDecoder<PostEntitlementsFeaturesResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostEntitlementsFeaturesResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostEntitlementsFeaturesResponse> = when {
      alternative.id == "PostEntitlementsFeatures.response.alternative0" -> SdkResponseDecodeResult(
        value = PostEntitlementsFeaturesResponse.SuccessJson(
          json = EntitlementsCodecs.postEntitlementsFeaturesResponseCodecAlternative0Registry.select(listOf("PostEntitlementsFeatures.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostEntitlementsFeatures.response.alternative1" -> SdkResponseDecodeResult(
        value = PostEntitlementsFeaturesResponse.DefaultJson(
          json = EntitlementsCodecs.postEntitlementsFeaturesResponseCodecAlternative1Registry.select(listOf("PostEntitlementsFeatures.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      else -> error("No generated response decoder matched the selected response alternative.")
    }

    public override suspend fun decodeUnknown(
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
    ): PostEntitlementsFeaturesResponse = PostEntitlementsFeaturesResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostEntitlementsFeaturesId`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface PostEntitlementsFeaturesIdResponse {
    public class SuccessJson(
      public val json: EntitlementsFeature,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostEntitlementsFeaturesIdResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostEntitlementsFeaturesIdResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostEntitlementsFeaturesIdResponse
  }

  private object PostEntitlementsFeaturesIdResponseDecoder : SdkResponseAlternativeDecoder<PostEntitlementsFeaturesIdResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostEntitlementsFeaturesIdResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostEntitlementsFeaturesIdResponse> = when {
      alternative.id == "PostEntitlementsFeaturesId.response.alternative0" -> SdkResponseDecodeResult(
        value = PostEntitlementsFeaturesIdResponse.SuccessJson(
          json = EntitlementsCodecs.postEntitlementsFeaturesIdResponseCodecAlternative0Registry.select(listOf("PostEntitlementsFeaturesId.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostEntitlementsFeaturesId.response.alternative1" -> SdkResponseDecodeResult(
        value = PostEntitlementsFeaturesIdResponse.DefaultJson(
          json = EntitlementsCodecs.postEntitlementsFeaturesIdResponseCodecAlternative1Registry.select(listOf("PostEntitlementsFeaturesId.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      else -> error("No generated response decoder matched the selected response alternative.")
    }

    public override suspend fun decodeUnknown(
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
    ): PostEntitlementsFeaturesIdResponse = PostEntitlementsFeaturesIdResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    public val getEntitlementsActiveEntitlementsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetEntitlementsActiveEntitlements",
          method = "GET",
          path = "/v1/entitlements/active_entitlements",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1EntitlementsActiveEntitlementsGetResponse200JsonX6fcf54bc",
              mode = SdkResponseMode.BUFFERED,
              id = "GetEntitlementsActiveEntitlements.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetEntitlementsActiveEntitlements.response.alternative1",
            ),
          ),
          security = listOf(
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "basicAuth", scopes = emptyList()),
            )),
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "bearerAuth", scopes = emptyList()),
            )),
          ),
          safety = OperationSafety(safe = true, idempotent = true),
          idempotency = null,
          retry = RetryDescriptor(
            retryableStatusCodes = emptyList(),
            retryConnectionErrors = true,
            maxAttempts = 1,
            backoff = BackoffHints(baseDelayMillis = 250, multiplier = 2.0, maxDelayMillis = 5_000),
          ),
          pagination = null,
          streaming = null,
        ) }

    public val getEntitlementsActiveEntitlementsIdMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetEntitlementsActiveEntitlementsId",
          method = "GET",
          path = "/v1/entitlements/active_entitlements/{id}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "EntitlementsActiveEntitlement",
              mode = SdkResponseMode.BUFFERED,
              id = "GetEntitlementsActiveEntitlementsId.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetEntitlementsActiveEntitlementsId.response.alternative1",
            ),
          ),
          security = listOf(
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "basicAuth", scopes = emptyList()),
            )),
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "bearerAuth", scopes = emptyList()),
            )),
          ),
          safety = OperationSafety(safe = true, idempotent = true),
          idempotency = null,
          retry = RetryDescriptor(
            retryableStatusCodes = emptyList(),
            retryConnectionErrors = true,
            maxAttempts = 1,
            backoff = BackoffHints(baseDelayMillis = 250, multiplier = 2.0, maxDelayMillis = 5_000),
          ),
          pagination = null,
          streaming = null,
        ) }

    public val getEntitlementsFeaturesMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetEntitlementsFeatures",
          method = "GET",
          path = "/v1/entitlements/features",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1EntitlementsFeaturesGetResponse200JsonXb2e0222c",
              mode = SdkResponseMode.BUFFERED,
              id = "GetEntitlementsFeatures.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetEntitlementsFeatures.response.alternative1",
            ),
          ),
          security = listOf(
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "basicAuth", scopes = emptyList()),
            )),
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "bearerAuth", scopes = emptyList()),
            )),
          ),
          safety = OperationSafety(safe = true, idempotent = true),
          idempotency = null,
          retry = RetryDescriptor(
            retryableStatusCodes = emptyList(),
            retryConnectionErrors = true,
            maxAttempts = 1,
            backoff = BackoffHints(baseDelayMillis = 250, multiplier = 2.0, maxDelayMillis = 5_000),
          ),
          pagination = null,
          streaming = null,
        ) }

    public val getEntitlementsFeaturesIdMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetEntitlementsFeaturesId",
          method = "GET",
          path = "/v1/entitlements/features/{id}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "EntitlementsFeature",
              mode = SdkResponseMode.BUFFERED,
              id = "GetEntitlementsFeaturesId.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetEntitlementsFeaturesId.response.alternative1",
            ),
          ),
          security = listOf(
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "basicAuth", scopes = emptyList()),
            )),
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "bearerAuth", scopes = emptyList()),
            )),
          ),
          safety = OperationSafety(safe = true, idempotent = true),
          idempotency = null,
          retry = RetryDescriptor(
            retryableStatusCodes = emptyList(),
            retryConnectionErrors = true,
            maxAttempts = 1,
            backoff = BackoffHints(baseDelayMillis = 250, multiplier = 2.0, maxDelayMillis = 5_000),
          ),
          pagination = null,
          streaming = null,
        ) }

    public val postEntitlementsFeaturesMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostEntitlementsFeatures",
          method = "POST",
          path = "/v1/entitlements/features",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "EntitlementsFeature",
              mode = SdkResponseMode.BUFFERED,
              id = "PostEntitlementsFeatures.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostEntitlementsFeatures.response.alternative1",
            ),
          ),
          security = listOf(
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "basicAuth", scopes = emptyList()),
            )),
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "bearerAuth", scopes = emptyList()),
            )),
          ),
          safety = OperationSafety(safe = false, idempotent = false),
          idempotency = null,
          retry = RetryDescriptor(
            retryableStatusCodes = emptyList(),
            retryConnectionErrors = false,
            maxAttempts = 1,
            backoff = BackoffHints(baseDelayMillis = 250, multiplier = 2.0, maxDelayMillis = 5_000),
          ),
          pagination = null,
          streaming = null,
        ) }

    public val postEntitlementsFeaturesIdMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostEntitlementsFeaturesId",
          method = "POST",
          path = "/v1/entitlements/features/{id}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "EntitlementsFeature",
              mode = SdkResponseMode.BUFFERED,
              id = "PostEntitlementsFeaturesId.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostEntitlementsFeaturesId.response.alternative1",
            ),
          ),
          security = listOf(
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "basicAuth", scopes = emptyList()),
            )),
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "bearerAuth", scopes = emptyList()),
            )),
          ),
          safety = OperationSafety(safe = false, idempotent = false),
          idempotency = null,
          retry = RetryDescriptor(
            retryableStatusCodes = emptyList(),
            retryConnectionErrors = false,
            maxAttempts = 1,
            backoff = BackoffHints(baseDelayMillis = 250, multiplier = 2.0, maxDelayMillis = 5_000),
          ),
          pagination = null,
          streaming = null,
        ) }
  }
}
