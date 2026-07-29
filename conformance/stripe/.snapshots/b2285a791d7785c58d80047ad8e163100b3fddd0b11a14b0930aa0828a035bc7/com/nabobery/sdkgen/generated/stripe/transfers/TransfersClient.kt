package com.nabobery.sdkgen.generated.stripe.transfers

import com.nabobery.sdkgen.generated.stripe.Error
import com.nabobery.sdkgen.generated.stripe.InlineV1TransfersGetParameterX4f65b2d5
import com.nabobery.sdkgen.generated.stripe.InlineV1TransfersGetResponse200JsonX9fde3508
import com.nabobery.sdkgen.generated.stripe.InlineV1TransfersPostRequestFormX82d647ba
import com.nabobery.sdkgen.generated.stripe.InlineV1TransfersPostRequestFormX8b1e7618
import com.nabobery.sdkgen.generated.stripe.InlineV1TransfersReversalsGetResponse200JsonX52ef3235
import com.nabobery.sdkgen.generated.stripe.InlineV1TransfersReversalsPostRequestFormX0b04aced
import com.nabobery.sdkgen.generated.stripe.InlineV1TransfersReversalsPostRequestFormX5a6bb128
import com.nabobery.sdkgen.generated.stripe.SdkJson
import com.nabobery.sdkgen.generated.stripe.Transfer
import com.nabobery.sdkgen.generated.stripe.TransferReversal
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
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.collections.Set
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive

public object TransfersCodecs {
  public const val GETTRANSFERS_REQUEST_CODEC_ID: String = "GetTransfers.request"

  private val getTransfersRequestCodec: MediaTypeCodec<JsonObject?> = GetTransfersFormCodec

  private val getTransfersResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1TransfersGetResponse200JsonX9fde3508> =
      KotlinxSerializationCodec("GetTransfers.response.alternative0", InlineV1TransfersGetResponse200JsonX9fde3508.Serializer, SdkJson)

  public val getTransfersResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1TransfersGetResponse200JsonX9fde3508> =
      MediaTypeCodecRegistry.of(getTransfersResponseCodecAlternative0Codec)

  private val getTransfersResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetTransfers.response.alternative1", Error.Serializer, SdkJson)

  public val getTransfersResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getTransfersResponseCodecAlternative1Codec)

  public val getTransfersRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getTransfersRequestCodec)

  public const val GETTRANSFERSIDREVERSALS_REQUEST_CODEC_ID: String =
      "GetTransfersIdReversals.request"

  private val getTransfersIdReversalsRequestCodec: MediaTypeCodec<JsonObject?> =
      GetTransfersIdReversalsFormCodec

  private val getTransfersIdReversalsResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1TransfersReversalsGetResponse200JsonX52ef3235> =
      KotlinxSerializationCodec("GetTransfersIdReversals.response.alternative0", InlineV1TransfersReversalsGetResponse200JsonX52ef3235.Serializer, SdkJson)

  public val getTransfersIdReversalsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1TransfersReversalsGetResponse200JsonX52ef3235> =
      MediaTypeCodecRegistry.of(getTransfersIdReversalsResponseCodecAlternative0Codec)

  private val getTransfersIdReversalsResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetTransfersIdReversals.response.alternative1", Error.Serializer, SdkJson)

  public val getTransfersIdReversalsResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error>
      = MediaTypeCodecRegistry.of(getTransfersIdReversalsResponseCodecAlternative1Codec)

  public val getTransfersIdReversalsRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getTransfersIdReversalsRequestCodec)

  public const val GETTRANSFERSTRANSFER_REQUEST_CODEC_ID: String = "GetTransfersTransfer.request"

  private val getTransfersTransferRequestCodec: MediaTypeCodec<JsonObject?> =
      GetTransfersTransferFormCodec

  private val getTransfersTransferResponseCodecAlternative0Codec: MediaTypeCodec<Transfer> =
      KotlinxSerializationCodec("GetTransfersTransfer.response.alternative0", Transfer.Serializer, SdkJson)

  public val getTransfersTransferResponseCodecAlternative0Registry: MediaTypeCodecRegistry<Transfer>
      = MediaTypeCodecRegistry.of(getTransfersTransferResponseCodecAlternative0Codec)

  private val getTransfersTransferResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetTransfersTransfer.response.alternative1", Error.Serializer, SdkJson)

  public val getTransfersTransferResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getTransfersTransferResponseCodecAlternative1Codec)

  public val getTransfersTransferRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getTransfersTransferRequestCodec)

  public const val GETTRANSFERSTRANSFERREVERSALSID_REQUEST_CODEC_ID: String =
      "GetTransfersTransferReversalsId.request"

  private val getTransfersTransferReversalsIdRequestCodec: MediaTypeCodec<JsonObject?> =
      GetTransfersTransferReversalsIdFormCodec

  private val getTransfersTransferReversalsIdResponseCodecAlternative0Codec:
      MediaTypeCodec<TransferReversal> =
      KotlinxSerializationCodec("GetTransfersTransferReversalsId.response.alternative0", TransferReversal.Serializer, SdkJson)

  public val getTransfersTransferReversalsIdResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<TransferReversal> =
      MediaTypeCodecRegistry.of(getTransfersTransferReversalsIdResponseCodecAlternative0Codec)

  private val getTransfersTransferReversalsIdResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetTransfersTransferReversalsId.response.alternative1", Error.Serializer, SdkJson)

  public val getTransfersTransferReversalsIdResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getTransfersTransferReversalsIdResponseCodecAlternative1Codec)

  public val getTransfersTransferReversalsIdRequestCodecRegistry:
      MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getTransfersTransferReversalsIdRequestCodec)

  public const val POSTTRANSFERS_REQUEST_CODEC_ID: String = "PostTransfers.request"

  private val postTransfersRequestCodec: MediaTypeCodec<InlineV1TransfersPostRequestFormX82d647ba> =
      PostTransfersFormCodec

  private val postTransfersResponseCodecAlternative0Codec: MediaTypeCodec<Transfer> =
      KotlinxSerializationCodec("PostTransfers.response.alternative0", Transfer.Serializer, SdkJson)

  public val postTransfersResponseCodecAlternative0Registry: MediaTypeCodecRegistry<Transfer> =
      MediaTypeCodecRegistry.of(postTransfersResponseCodecAlternative0Codec)

  private val postTransfersResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostTransfers.response.alternative1", Error.Serializer, SdkJson)

  public val postTransfersResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postTransfersResponseCodecAlternative1Codec)

  public val postTransfersRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1TransfersPostRequestFormX82d647ba> =
      MediaTypeCodecRegistry.of(postTransfersRequestCodec)

  public const val POSTTRANSFERSIDREVERSALS_REQUEST_CODEC_ID: String =
      "PostTransfersIdReversals.request"

  private val postTransfersIdReversalsRequestCodec:
      MediaTypeCodec<InlineV1TransfersReversalsPostRequestFormX5a6bb128?> =
      PostTransfersIdReversalsFormCodec

  private val postTransfersIdReversalsResponseCodecAlternative0Codec:
      MediaTypeCodec<TransferReversal> =
      KotlinxSerializationCodec("PostTransfersIdReversals.response.alternative0", TransferReversal.Serializer, SdkJson)

  public val postTransfersIdReversalsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<TransferReversal> =
      MediaTypeCodecRegistry.of(postTransfersIdReversalsResponseCodecAlternative0Codec)

  private val postTransfersIdReversalsResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostTransfersIdReversals.response.alternative1", Error.Serializer, SdkJson)

  public val postTransfersIdReversalsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postTransfersIdReversalsResponseCodecAlternative1Codec)

  public val postTransfersIdReversalsRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1TransfersReversalsPostRequestFormX5a6bb128?> =
      MediaTypeCodecRegistry.of(postTransfersIdReversalsRequestCodec)

  public const val POSTTRANSFERSTRANSFER_REQUEST_CODEC_ID: String = "PostTransfersTransfer.request"

  private val postTransfersTransferRequestCodec:
      MediaTypeCodec<InlineV1TransfersPostRequestFormX8b1e7618?> = PostTransfersTransferFormCodec

  private val postTransfersTransferResponseCodecAlternative0Codec: MediaTypeCodec<Transfer> =
      KotlinxSerializationCodec("PostTransfersTransfer.response.alternative0", Transfer.Serializer, SdkJson)

  public val postTransfersTransferResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<Transfer> =
      MediaTypeCodecRegistry.of(postTransfersTransferResponseCodecAlternative0Codec)

  private val postTransfersTransferResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostTransfersTransfer.response.alternative1", Error.Serializer, SdkJson)

  public val postTransfersTransferResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postTransfersTransferResponseCodecAlternative1Codec)

  public val postTransfersTransferRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1TransfersPostRequestFormX8b1e7618?> =
      MediaTypeCodecRegistry.of(postTransfersTransferRequestCodec)

  public const val POSTTRANSFERSTRANSFERREVERSALSID_REQUEST_CODEC_ID: String =
      "PostTransfersTransferReversalsId.request"

  private val postTransfersTransferReversalsIdRequestCodec:
      MediaTypeCodec<InlineV1TransfersReversalsPostRequestFormX0b04aced?> =
      PostTransfersTransferReversalsIdFormCodec

  private val postTransfersTransferReversalsIdResponseCodecAlternative0Codec:
      MediaTypeCodec<TransferReversal> =
      KotlinxSerializationCodec("PostTransfersTransferReversalsId.response.alternative0", TransferReversal.Serializer, SdkJson)

  public val postTransfersTransferReversalsIdResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<TransferReversal> =
      MediaTypeCodecRegistry.of(postTransfersTransferReversalsIdResponseCodecAlternative0Codec)

  private val postTransfersTransferReversalsIdResponseCodecAlternative1Codec: MediaTypeCodec<Error>
      =
      KotlinxSerializationCodec("PostTransfersTransferReversalsId.response.alternative1", Error.Serializer, SdkJson)

  public val postTransfersTransferReversalsIdResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postTransfersTransferReversalsIdResponseCodecAlternative1Codec)

  public val postTransfersTransferReversalsIdRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1TransfersReversalsPostRequestFormX0b04aced?> =
      MediaTypeCodecRegistry.of(postTransfersTransferReversalsIdRequestCodec)

  public object GetTransfersFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetTransfers.request"

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

  public object GetTransfersIdReversalsFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetTransfersIdReversals.request"

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

  public object GetTransfersTransferFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetTransfersTransfer.request"

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

  public object GetTransfersTransferReversalsIdFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetTransfersTransferReversalsId.request"

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

  public object PostTransfersFormCodec : MediaTypeCodec<InlineV1TransfersPostRequestFormX82d647ba> {
    override val id: String = "PostTransfers.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1TransfersPostRequestFormX82d647ba, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      request.amount?.let { formValue0 ->
        form.add("amount", formValue0.toString())
      }
      form.add("currency", request.currency)
      request.description?.let { formValue0 ->
        form.add("description", formValue0)
      }
      form.add("destination", request.destination)
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
        formValue0.forEach { (formKey1, formMapValue1) ->
          form.add("metadata" + "[" + formKey1 + "]", formMapValue1)
        }
      }
      request.sourceTransaction?.let { formValue0 ->
        form.add("source_transaction", formValue0)
      }
      request.sourceType?.let { formValue0 ->
        form.add("source_type", formValue0.value)
      }
      request.transferGroup?.let { formValue0 ->
        form.add("transfer_group", formValue0)
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1TransfersPostRequestFormX82d647ba {
      error("Form request codecs do not decode response bodies.")
    }
  }

  public object PostTransfersIdReversalsFormCodec : MediaTypeCodec<InlineV1TransfersReversalsPostRequestFormX5a6bb128?> {
    override val id: String = "PostTransfersIdReversals.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1TransfersReversalsPostRequestFormX5a6bb128?, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      request.amount?.let { formValue0 ->
        form.add("amount", formValue0.toString())
      }
      request.description?.let { formValue0 ->
        form.add("description", formValue0)
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
          formValue0.inlineV1TransfersReversalsPostRequestFormMetadataAnyOf2X4ca854a2 != null -> {
            form.add("metadata", requireNotNull(formValue0.inlineV1TransfersReversalsPostRequestFormMetadataAnyOf2X4ca854a2).value)
          }
          else -> {
            error("Form union value has no selected branch")
          }
        }
      }
      request.refundApplicationFee?.let { formValue0 ->
        form.add("refund_application_fee", formValue0.toString())
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1TransfersReversalsPostRequestFormX5a6bb128? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  public object PostTransfersTransferFormCodec : MediaTypeCodec<InlineV1TransfersPostRequestFormX8b1e7618?> {
    override val id: String = "PostTransfersTransfer.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1TransfersPostRequestFormX8b1e7618?, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      request.description?.let { formValue0 ->
        form.add("description", formValue0)
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
          formValue0.inlineV1TransfersPostRequestFormMetadataAnyOf2X76d5e619 != null -> {
            form.add("metadata", requireNotNull(formValue0.inlineV1TransfersPostRequestFormMetadataAnyOf2X76d5e619).value)
          }
          else -> {
            error("Form union value has no selected branch")
          }
        }
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1TransfersPostRequestFormX8b1e7618? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  public object PostTransfersTransferReversalsIdFormCodec : MediaTypeCodec<InlineV1TransfersReversalsPostRequestFormX0b04aced?> {
    override val id: String = "PostTransfersTransferReversalsId.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1TransfersReversalsPostRequestFormX0b04aced?, mediaType: String): SdkRequestBody {
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
      request.metadata?.let { formValue0 ->
        require(formValue0.matchedBranches.size == 1) { "Form union value must match exactly one wire-kind branch" }
        when {
          formValue0.branch1 != null -> {
            requireNotNull(formValue0.branch1).forEach { (formKey2, formMapValue2) ->
              val formPrimitive2 = formMapValue2 as? JsonPrimitive ?: error("Form map values encoded from a raw JSON object must be JSON primitives")
              form.add("metadata" + "[" + formKey2 + "]", formPrimitive2.content)
            }
          }
          formValue0.inlineV1TransfersReversalsPostRequestFormMetadataAnyOf2X6e78514b != null -> {
            form.add("metadata", requireNotNull(formValue0.inlineV1TransfersReversalsPostRequestFormMetadataAnyOf2X6e78514b).value)
          }
          else -> {
            error("Form union value has no selected branch")
          }
        }
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1TransfersReversalsPostRequestFormX0b04aced? {
      error("Form request codecs do not decode response bodies.")
    }
  }
}

/**
 * Client for the 'transfers' group of Stripe API.
 */
public class TransfersClient(
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
      SdkExecutor(transport, authentication = this@TransfersClient.authentication)

  /**
   * <p>Returns a list of existing transfers sent to connected accounts. The transfers are returned in sorted order,
   * with the most recently created transfers appearing first.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param created Only return transfers that were created during the given date interval.
   * @param destination Only return transfers for the destination specified by this account ID.
   * @param endingBefore A cursor for use in pagination. `ending_before` is an object ID that defines your place in the
   * list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent
   * call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
   * @param expand Specifies which fields in the response should be expanded.
   * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is
   * 10.
   * @param startingAfter A cursor for use in pagination. `starting_after` is an object ID that defines your place in
   * the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent
   * call can include `starting_after=obj_foo` in order to fetch the next page of the list.
   * @param transferGroup Only return transfers with the specified transfer group.
   * @param options Execution options.
   */
  public suspend fun getTransfersWithResponse(
    request: JsonObject? = null,
    created: InlineV1TransfersGetParameterX4f65b2d5? = null,
    destination: String? = null,
    endingBefore: String? = null,
    expand: List<String>? = null,
    limit: Int? = null,
    startingAfter: String? = null,
    transferGroup: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetTransfersResponse> = executor.executeWithResponse<JsonObject?, GetTransfersResponse>(SdkExecutionRequest(getTransfersMetadata, baseUri, request, listOf(TransfersCodecs.GETTRANSFERS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "created", values = created?.let { value ->
    val primitive = value.raw as? JsonPrimitive ?: error("Stripe-compatible deepObject scalar fallback requires a JSON primitive value")
    listOf(primitive.content)
    }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "destination", values = destination?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "ending_before", values = endingBefore?.let { listOf(it.toString()) }.orEmpty()))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "starting_after", values = startingAfter?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "transfer_group", values = transferGroup?.let { listOf(it.toString()) }.orEmpty()))
  }), TransfersCodecs.getTransfersRequestCodecRegistry, GetTransfersResponseDecoder, options)

  /**
   * <p>You can see a list of the reversals belonging to a specific transfer. Note that the 10 most recent reversals are
   * always available by default on the transfer object. If you need more than those 10, you can use this API method and
   * the <code>limit</code> and <code>starting_after</code> parameters to page through additional reversals.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param id Wire parameter `id`.
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
  public suspend fun getTransfersIdReversalsWithResponse(
    request: JsonObject? = null,
    id: String,
    endingBefore: String? = null,
    expand: List<String>? = null,
    limit: Int? = null,
    startingAfter: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetTransfersIdReversalsResponse> = executor.executeWithResponse<JsonObject?, GetTransfersIdReversalsResponse>(SdkExecutionRequest(getTransfersIdReversalsMetadata, baseUri, request, listOf(TransfersCodecs.GETTRANSFERSIDREVERSALS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "ending_before", values = endingBefore?.let { listOf(it.toString()) }.orEmpty()))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "starting_after", values = startingAfter?.let { listOf(it.toString()) }.orEmpty()))
  }), TransfersCodecs.getTransfersIdReversalsRequestCodecRegistry, GetTransfersIdReversalsResponseDecoder, options)

  /**
   * <p>Retrieves the details of an existing transfer. Supply the unique transfer ID from either a transfer creation
   * request or the transfer list, and Stripe will return the corresponding transfer information.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param transfer Wire parameter `transfer`.
   * @param expand Specifies which fields in the response should be expanded.
   * @param options Execution options.
   */
  public suspend fun getTransfersTransferWithResponse(
    request: JsonObject? = null,
    transfer: String,
    expand: List<String>? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetTransfersTransferResponse> = executor.executeWithResponse<JsonObject?, GetTransfersTransferResponse>(SdkExecutionRequest(getTransfersTransferMetadata, baseUri, request, listOf(TransfersCodecs.GETTRANSFERSTRANSFER_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "transfer", values = listOf(transfer.toString())))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
  }), TransfersCodecs.getTransfersTransferRequestCodecRegistry, GetTransfersTransferResponseDecoder, options)

  /**
   * <p>By default, you can see the 10 most recent reversals stored directly on the transfer object, but you can also
   * retrieve details about a specific reversal stored on the transfer.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param id Wire parameter `id`.
   * @param transfer Wire parameter `transfer`.
   * @param expand Specifies which fields in the response should be expanded.
   * @param options Execution options.
   */
  public suspend fun getTransfersTransferReversalsIdWithResponse(
    request: JsonObject? = null,
    id: String,
    transfer: String,
    expand: List<String>? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetTransfersTransferReversalsIdResponse> = executor.executeWithResponse<JsonObject?, GetTransfersTransferReversalsIdResponse>(SdkExecutionRequest(getTransfersTransferReversalsIdMetadata, baseUri, request, listOf(TransfersCodecs.GETTRANSFERSTRANSFERREVERSALSID_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "transfer", values = listOf(transfer.toString())))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
  }), TransfersCodecs.getTransfersTransferReversalsIdRequestCodecRegistry, GetTransfersTransferReversalsIdResponseDecoder, options)

  /**
   * <p>To send funds from your Stripe account to a connected account, you create a new transfer object. Your <a
   * href="#balance">Stripe balance</a> must be able to cover the transfer amount, or you’ll receive an “Insufficient
   * Funds” error.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param options Execution options.
   */
  public suspend fun postTransfersWithResponse(request: InlineV1TransfersPostRequestFormX82d647ba, options: CallOptions = CallOptions()): SdkResponseResult<PostTransfersResponse> = executor.executeWithResponse<InlineV1TransfersPostRequestFormX82d647ba, PostTransfersResponse>(SdkExecutionRequest(postTransfersMetadata, baseUri, request, listOf(TransfersCodecs.POSTTRANSFERS_REQUEST_CODEC_ID), emptyList()), TransfersCodecs.postTransfersRequestCodecRegistry, PostTransfersResponseDecoder, options)

  /**
   * <p>When you create a new reversal, you must specify a transfer to create it on.</p>
   *
   * <p>When reversing transfers, you can optionally reverse part of the transfer. You can do so as many times as you
   * wish until the entire transfer has been reversed.</p>
   *
   * <p>Once entirely reversed, a transfer can’t be reversed again. This method will return an error when called on an
   * already-reversed transfer, or when trying to reverse more money than is left on a transfer.</p>
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
  public suspend fun postTransfersIdReversalsWithResponse(
    request: InlineV1TransfersReversalsPostRequestFormX5a6bb128? = null,
    id: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostTransfersIdReversalsResponse> = executor.executeWithResponse<InlineV1TransfersReversalsPostRequestFormX5a6bb128?, PostTransfersIdReversalsResponse>(SdkExecutionRequest(postTransfersIdReversalsMetadata, baseUri, request, listOf(TransfersCodecs.POSTTRANSFERSIDREVERSALS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
  }), TransfersCodecs.postTransfersIdReversalsRequestCodecRegistry, PostTransfersIdReversalsResponseDecoder, options)

  /**
   * <p>Updates the specified transfer by setting the values of the parameters passed. Any parameters not provided will
   * be left unchanged.</p>
   *
   * <p>This request accepts only metadata as an argument.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param transfer Wire parameter `transfer`.
   * @param options Execution options.
   */
  public suspend fun postTransfersTransferWithResponse(
    request: InlineV1TransfersPostRequestFormX8b1e7618? = null,
    transfer: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostTransfersTransferResponse> = executor.executeWithResponse<InlineV1TransfersPostRequestFormX8b1e7618?, PostTransfersTransferResponse>(SdkExecutionRequest(postTransfersTransferMetadata, baseUri, request, listOf(TransfersCodecs.POSTTRANSFERSTRANSFER_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "transfer", values = listOf(transfer.toString())))
  }), TransfersCodecs.postTransfersTransferRequestCodecRegistry, PostTransfersTransferResponseDecoder, options)

  /**
   * <p>Updates the specified reversal by setting the values of the parameters passed. Any parameters not provided will
   * be left unchanged.</p>
   *
   * <p>This request only accepts metadata and description as arguments.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param id Wire parameter `id`.
   * @param transfer Wire parameter `transfer`.
   * @param options Execution options.
   */
  public suspend fun postTransfersTransferReversalsIdWithResponse(
    request: InlineV1TransfersReversalsPostRequestFormX0b04aced? = null,
    id: String,
    transfer: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostTransfersTransferReversalsIdResponse> = executor.executeWithResponse<InlineV1TransfersReversalsPostRequestFormX0b04aced?, PostTransfersTransferReversalsIdResponse>(SdkExecutionRequest(postTransfersTransferReversalsIdMetadata, baseUri, request, listOf(TransfersCodecs.POSTTRANSFERSTRANSFERREVERSALSID_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "transfer", values = listOf(transfer.toString())))
  }), TransfersCodecs.postTransfersTransferReversalsIdRequestCodecRegistry, PostTransfersTransferReversalsIdResponseDecoder, options)

  /**
   * Typed response alternatives for `GetTransfers`. Non-success alternatives are not converted into success values.
   */
  public sealed interface GetTransfersResponse {
    public class SuccessJson(
      public val json: InlineV1TransfersGetResponse200JsonX9fde3508,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTransfersResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTransfersResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTransfersResponse
  }

  private object GetTransfersResponseDecoder : SdkResponseAlternativeDecoder<GetTransfersResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetTransfersResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetTransfersResponse> = when {
      alternative.id == "GetTransfers.response.alternative0" -> SdkResponseDecodeResult(
        value = GetTransfersResponse.SuccessJson(
          json = TransfersCodecs.getTransfersResponseCodecAlternative0Registry.select(listOf("GetTransfers.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetTransfers.response.alternative1" -> SdkResponseDecodeResult(
        value = GetTransfersResponse.DefaultJson(
          json = TransfersCodecs.getTransfersResponseCodecAlternative1Registry.select(listOf("GetTransfers.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetTransfersResponse = GetTransfersResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetTransfersIdReversals`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface GetTransfersIdReversalsResponse {
    public class SuccessJson(
      public val json: InlineV1TransfersReversalsGetResponse200JsonX52ef3235,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTransfersIdReversalsResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTransfersIdReversalsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTransfersIdReversalsResponse
  }

  private object GetTransfersIdReversalsResponseDecoder : SdkResponseAlternativeDecoder<GetTransfersIdReversalsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetTransfersIdReversalsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetTransfersIdReversalsResponse> = when {
      alternative.id == "GetTransfersIdReversals.response.alternative0" -> SdkResponseDecodeResult(
        value = GetTransfersIdReversalsResponse.SuccessJson(
          json = TransfersCodecs.getTransfersIdReversalsResponseCodecAlternative0Registry.select(listOf("GetTransfersIdReversals.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetTransfersIdReversals.response.alternative1" -> SdkResponseDecodeResult(
        value = GetTransfersIdReversalsResponse.DefaultJson(
          json = TransfersCodecs.getTransfersIdReversalsResponseCodecAlternative1Registry.select(listOf("GetTransfersIdReversals.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetTransfersIdReversalsResponse = GetTransfersIdReversalsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetTransfersTransfer`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface GetTransfersTransferResponse {
    public class SuccessJson(
      public val json: Transfer,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTransfersTransferResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTransfersTransferResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTransfersTransferResponse
  }

  private object GetTransfersTransferResponseDecoder : SdkResponseAlternativeDecoder<GetTransfersTransferResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetTransfersTransferResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetTransfersTransferResponse> = when {
      alternative.id == "GetTransfersTransfer.response.alternative0" -> SdkResponseDecodeResult(
        value = GetTransfersTransferResponse.SuccessJson(
          json = TransfersCodecs.getTransfersTransferResponseCodecAlternative0Registry.select(listOf("GetTransfersTransfer.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetTransfersTransfer.response.alternative1" -> SdkResponseDecodeResult(
        value = GetTransfersTransferResponse.DefaultJson(
          json = TransfersCodecs.getTransfersTransferResponseCodecAlternative1Registry.select(listOf("GetTransfersTransfer.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetTransfersTransferResponse = GetTransfersTransferResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetTransfersTransferReversalsId`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface GetTransfersTransferReversalsIdResponse {
    public class SuccessJson(
      public val json: TransferReversal,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTransfersTransferReversalsIdResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTransfersTransferReversalsIdResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTransfersTransferReversalsIdResponse
  }

  private object GetTransfersTransferReversalsIdResponseDecoder : SdkResponseAlternativeDecoder<GetTransfersTransferReversalsIdResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetTransfersTransferReversalsIdResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetTransfersTransferReversalsIdResponse> = when {
      alternative.id == "GetTransfersTransferReversalsId.response.alternative0" -> SdkResponseDecodeResult(
        value = GetTransfersTransferReversalsIdResponse.SuccessJson(
          json = TransfersCodecs.getTransfersTransferReversalsIdResponseCodecAlternative0Registry.select(listOf("GetTransfersTransferReversalsId.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetTransfersTransferReversalsId.response.alternative1" -> SdkResponseDecodeResult(
        value = GetTransfersTransferReversalsIdResponse.DefaultJson(
          json = TransfersCodecs.getTransfersTransferReversalsIdResponseCodecAlternative1Registry.select(listOf("GetTransfersTransferReversalsId.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetTransfersTransferReversalsIdResponse = GetTransfersTransferReversalsIdResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostTransfers`. Non-success alternatives are not converted into success values.
   */
  public sealed interface PostTransfersResponse {
    public class SuccessJson(
      public val json: Transfer,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTransfersResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTransfersResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTransfersResponse
  }

  private object PostTransfersResponseDecoder : SdkResponseAlternativeDecoder<PostTransfersResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostTransfersResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostTransfersResponse> = when {
      alternative.id == "PostTransfers.response.alternative0" -> SdkResponseDecodeResult(
        value = PostTransfersResponse.SuccessJson(
          json = TransfersCodecs.postTransfersResponseCodecAlternative0Registry.select(listOf("PostTransfers.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostTransfers.response.alternative1" -> SdkResponseDecodeResult(
        value = PostTransfersResponse.DefaultJson(
          json = TransfersCodecs.postTransfersResponseCodecAlternative1Registry.select(listOf("PostTransfers.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostTransfersResponse = PostTransfersResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostTransfersIdReversals`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface PostTransfersIdReversalsResponse {
    public class SuccessJson(
      public val json: TransferReversal,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTransfersIdReversalsResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTransfersIdReversalsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTransfersIdReversalsResponse
  }

  private object PostTransfersIdReversalsResponseDecoder : SdkResponseAlternativeDecoder<PostTransfersIdReversalsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostTransfersIdReversalsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostTransfersIdReversalsResponse> = when {
      alternative.id == "PostTransfersIdReversals.response.alternative0" -> SdkResponseDecodeResult(
        value = PostTransfersIdReversalsResponse.SuccessJson(
          json = TransfersCodecs.postTransfersIdReversalsResponseCodecAlternative0Registry.select(listOf("PostTransfersIdReversals.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostTransfersIdReversals.response.alternative1" -> SdkResponseDecodeResult(
        value = PostTransfersIdReversalsResponse.DefaultJson(
          json = TransfersCodecs.postTransfersIdReversalsResponseCodecAlternative1Registry.select(listOf("PostTransfersIdReversals.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostTransfersIdReversalsResponse = PostTransfersIdReversalsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostTransfersTransfer`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface PostTransfersTransferResponse {
    public class SuccessJson(
      public val json: Transfer,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTransfersTransferResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTransfersTransferResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTransfersTransferResponse
  }

  private object PostTransfersTransferResponseDecoder : SdkResponseAlternativeDecoder<PostTransfersTransferResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostTransfersTransferResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostTransfersTransferResponse> = when {
      alternative.id == "PostTransfersTransfer.response.alternative0" -> SdkResponseDecodeResult(
        value = PostTransfersTransferResponse.SuccessJson(
          json = TransfersCodecs.postTransfersTransferResponseCodecAlternative0Registry.select(listOf("PostTransfersTransfer.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostTransfersTransfer.response.alternative1" -> SdkResponseDecodeResult(
        value = PostTransfersTransferResponse.DefaultJson(
          json = TransfersCodecs.postTransfersTransferResponseCodecAlternative1Registry.select(listOf("PostTransfersTransfer.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostTransfersTransferResponse = PostTransfersTransferResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostTransfersTransferReversalsId`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface PostTransfersTransferReversalsIdResponse {
    public class SuccessJson(
      public val json: TransferReversal,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTransfersTransferReversalsIdResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTransfersTransferReversalsIdResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTransfersTransferReversalsIdResponse
  }

  private object PostTransfersTransferReversalsIdResponseDecoder : SdkResponseAlternativeDecoder<PostTransfersTransferReversalsIdResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostTransfersTransferReversalsIdResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostTransfersTransferReversalsIdResponse> = when {
      alternative.id == "PostTransfersTransferReversalsId.response.alternative0" -> SdkResponseDecodeResult(
        value = PostTransfersTransferReversalsIdResponse.SuccessJson(
          json = TransfersCodecs.postTransfersTransferReversalsIdResponseCodecAlternative0Registry.select(listOf("PostTransfersTransferReversalsId.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostTransfersTransferReversalsId.response.alternative1" -> SdkResponseDecodeResult(
        value = PostTransfersTransferReversalsIdResponse.DefaultJson(
          json = TransfersCodecs.postTransfersTransferReversalsIdResponseCodecAlternative1Registry.select(listOf("PostTransfersTransferReversalsId.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostTransfersTransferReversalsIdResponse = PostTransfersTransferReversalsIdResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    public val getTransfersMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetTransfers",
          method = "GET",
          path = "/v1/transfers",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1TransfersGetResponse200JsonX9fde3508",
              mode = SdkResponseMode.BUFFERED,
              id = "GetTransfers.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetTransfers.response.alternative1",
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

    public val getTransfersIdReversalsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetTransfersIdReversals",
          method = "GET",
          path = "/v1/transfers/{id}/reversals",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1TransfersReversalsGetResponse200JsonX52ef3235",
              mode = SdkResponseMode.BUFFERED,
              id = "GetTransfersIdReversals.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetTransfersIdReversals.response.alternative1",
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

    public val getTransfersTransferMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetTransfersTransfer",
          method = "GET",
          path = "/v1/transfers/{transfer}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "Transfer",
              mode = SdkResponseMode.BUFFERED,
              id = "GetTransfersTransfer.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetTransfersTransfer.response.alternative1",
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

    public val getTransfersTransferReversalsIdMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetTransfersTransferReversalsId",
          method = "GET",
          path = "/v1/transfers/{transfer}/reversals/{id}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "TransferReversal",
              mode = SdkResponseMode.BUFFERED,
              id = "GetTransfersTransferReversalsId.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetTransfersTransferReversalsId.response.alternative1",
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

    public val postTransfersMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostTransfers",
          method = "POST",
          path = "/v1/transfers",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "Transfer",
              mode = SdkResponseMode.BUFFERED,
              id = "PostTransfers.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostTransfers.response.alternative1",
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

    public val postTransfersIdReversalsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostTransfersIdReversals",
          method = "POST",
          path = "/v1/transfers/{id}/reversals",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "TransferReversal",
              mode = SdkResponseMode.BUFFERED,
              id = "PostTransfersIdReversals.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostTransfersIdReversals.response.alternative1",
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

    public val postTransfersTransferMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostTransfersTransfer",
          method = "POST",
          path = "/v1/transfers/{transfer}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "Transfer",
              mode = SdkResponseMode.BUFFERED,
              id = "PostTransfersTransfer.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostTransfersTransfer.response.alternative1",
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

    public val postTransfersTransferReversalsIdMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostTransfersTransferReversalsId",
          method = "POST",
          path = "/v1/transfers/{transfer}/reversals/{id}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "TransferReversal",
              mode = SdkResponseMode.BUFFERED,
              id = "PostTransfersTransferReversalsId.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostTransfersTransferReversalsId.response.alternative1",
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
