package io.github.nabobery.sdkgen.generated.stripe.creditnotes

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
import io.github.nabobery.sdkgen.generated.stripe.CreditNote
import io.github.nabobery.sdkgen.generated.stripe.Error
import io.github.nabobery.sdkgen.generated.stripe.InlineV1CreditNotesGetParameterXe79d31b2
import io.github.nabobery.sdkgen.generated.stripe.InlineV1CreditNotesGetResponse200JsonX78b47036
import io.github.nabobery.sdkgen.generated.stripe.InlineV1CreditNotesLinesGetResponse200JsonXd936e84d
import io.github.nabobery.sdkgen.generated.stripe.InlineV1CreditNotesPostRequestFormX4f4c481e
import io.github.nabobery.sdkgen.generated.stripe.InlineV1CreditNotesPostRequestFormXc40c1d58
import io.github.nabobery.sdkgen.generated.stripe.InlineV1CreditNotesVoidPostRequestFormX4419eb7c
import io.github.nabobery.sdkgen.generated.stripe.SdkJson
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.collections.Set
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive

internal object CreditNotesCodecs {
  internal const val GETCREDITNOTES_REQUEST_CODEC_ID: String = "GetCreditNotes.request"

  private val getCreditNotesRequestCodec: MediaTypeCodec<JsonObject?> = GetCreditNotesFormCodec

  private val getCreditNotesResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1CreditNotesGetResponse200JsonX78b47036> =
      KotlinxSerializationCodec("GetCreditNotes.response.alternative0", InlineV1CreditNotesGetResponse200JsonX78b47036.Serializer, SdkJson)

  internal val getCreditNotesResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1CreditNotesGetResponse200JsonX78b47036> =
      MediaTypeCodecRegistry.of(getCreditNotesResponseCodecAlternative0Codec)

  private val getCreditNotesResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetCreditNotes.response.alternative1", Error.Serializer, SdkJson)

  internal val getCreditNotesResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getCreditNotesResponseCodecAlternative1Codec)

  internal val getCreditNotesRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getCreditNotesRequestCodec)

  internal const val GETCREDITNOTESCREDITNOTELINES_REQUEST_CODEC_ID: String =
      "GetCreditNotesCreditNoteLines.request"

  private val getCreditNotesCreditNoteLinesRequestCodec: MediaTypeCodec<JsonObject?> =
      GetCreditNotesCreditNoteLinesFormCodec

  private val getCreditNotesCreditNoteLinesResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1CreditNotesLinesGetResponse200JsonXd936e84d> =
      KotlinxSerializationCodec("GetCreditNotesCreditNoteLines.response.alternative0", InlineV1CreditNotesLinesGetResponse200JsonXd936e84d.Serializer, SdkJson)

  internal val getCreditNotesCreditNoteLinesResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1CreditNotesLinesGetResponse200JsonXd936e84d> =
      MediaTypeCodecRegistry.of(getCreditNotesCreditNoteLinesResponseCodecAlternative0Codec)

  private val getCreditNotesCreditNoteLinesResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetCreditNotesCreditNoteLines.response.alternative1", Error.Serializer, SdkJson)

  internal val getCreditNotesCreditNoteLinesResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getCreditNotesCreditNoteLinesResponseCodecAlternative1Codec)

  internal val getCreditNotesCreditNoteLinesRequestCodecRegistry:
      MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getCreditNotesCreditNoteLinesRequestCodec)

  internal const val GETCREDITNOTESID_REQUEST_CODEC_ID: String = "GetCreditNotesId.request"

  private val getCreditNotesIdRequestCodec: MediaTypeCodec<JsonObject?> = GetCreditNotesIdFormCodec

  private val getCreditNotesIdResponseCodecAlternative0Codec: MediaTypeCodec<CreditNote> =
      KotlinxSerializationCodec("GetCreditNotesId.response.alternative0", CreditNote.Serializer, SdkJson)

  internal val getCreditNotesIdResponseCodecAlternative0Registry: MediaTypeCodecRegistry<CreditNote>
      = MediaTypeCodecRegistry.of(getCreditNotesIdResponseCodecAlternative0Codec)

  private val getCreditNotesIdResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetCreditNotesId.response.alternative1", Error.Serializer, SdkJson)

  internal val getCreditNotesIdResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getCreditNotesIdResponseCodecAlternative1Codec)

  internal val getCreditNotesIdRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getCreditNotesIdRequestCodec)

  internal const val POSTCREDITNOTES_REQUEST_CODEC_ID: String = "PostCreditNotes.request"

  private val postCreditNotesRequestCodec:
      MediaTypeCodec<InlineV1CreditNotesPostRequestFormXc40c1d58> = PostCreditNotesFormCodec

  private val postCreditNotesResponseCodecAlternative0Codec: MediaTypeCodec<CreditNote> =
      KotlinxSerializationCodec("PostCreditNotes.response.alternative0", CreditNote.Serializer, SdkJson)

  internal val postCreditNotesResponseCodecAlternative0Registry: MediaTypeCodecRegistry<CreditNote>
      = MediaTypeCodecRegistry.of(postCreditNotesResponseCodecAlternative0Codec)

  private val postCreditNotesResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostCreditNotes.response.alternative1", Error.Serializer, SdkJson)

  internal val postCreditNotesResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postCreditNotesResponseCodecAlternative1Codec)

  internal val postCreditNotesRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1CreditNotesPostRequestFormXc40c1d58> =
      MediaTypeCodecRegistry.of(postCreditNotesRequestCodec)

  internal const val POSTCREDITNOTESID_REQUEST_CODEC_ID: String = "PostCreditNotesId.request"

  private val postCreditNotesIdRequestCodec:
      MediaTypeCodec<InlineV1CreditNotesPostRequestFormX4f4c481e?> = PostCreditNotesIdFormCodec

  private val postCreditNotesIdResponseCodecAlternative0Codec: MediaTypeCodec<CreditNote> =
      KotlinxSerializationCodec("PostCreditNotesId.response.alternative0", CreditNote.Serializer, SdkJson)

  internal val postCreditNotesIdResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<CreditNote> =
      MediaTypeCodecRegistry.of(postCreditNotesIdResponseCodecAlternative0Codec)

  private val postCreditNotesIdResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostCreditNotesId.response.alternative1", Error.Serializer, SdkJson)

  internal val postCreditNotesIdResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postCreditNotesIdResponseCodecAlternative1Codec)

  internal val postCreditNotesIdRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1CreditNotesPostRequestFormX4f4c481e?> =
      MediaTypeCodecRegistry.of(postCreditNotesIdRequestCodec)

  internal const val POSTCREDITNOTESIDVOID_REQUEST_CODEC_ID: String =
      "PostCreditNotesIdVoid.request"

  private val postCreditNotesIdVoidRequestCodec:
      MediaTypeCodec<InlineV1CreditNotesVoidPostRequestFormX4419eb7c?> =
      PostCreditNotesIdVoidFormCodec

  private val postCreditNotesIdVoidResponseCodecAlternative0Codec: MediaTypeCodec<CreditNote> =
      KotlinxSerializationCodec("PostCreditNotesIdVoid.response.alternative0", CreditNote.Serializer, SdkJson)

  internal val postCreditNotesIdVoidResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<CreditNote> =
      MediaTypeCodecRegistry.of(postCreditNotesIdVoidResponseCodecAlternative0Codec)

  private val postCreditNotesIdVoidResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostCreditNotesIdVoid.response.alternative1", Error.Serializer, SdkJson)

  internal val postCreditNotesIdVoidResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error>
      = MediaTypeCodecRegistry.of(postCreditNotesIdVoidResponseCodecAlternative1Codec)

  internal val postCreditNotesIdVoidRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1CreditNotesVoidPostRequestFormX4419eb7c?> =
      MediaTypeCodecRegistry.of(postCreditNotesIdVoidRequestCodec)

  internal object GetCreditNotesFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetCreditNotes.request"

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

  internal object GetCreditNotesCreditNoteLinesFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetCreditNotesCreditNoteLines.request"

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

  internal object GetCreditNotesIdFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetCreditNotesId.request"

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

  internal object PostCreditNotesFormCodec : MediaTypeCodec<InlineV1CreditNotesPostRequestFormXc40c1d58> {
    override val id: String = "PostCreditNotes.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1CreditNotesPostRequestFormXc40c1d58, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      request.amount?.let { formValue0 ->
        form.add("amount", formValue0.toString())
      }
      request.creditAmount?.let { formValue0 ->
        form.add("credit_amount", formValue0.toString())
      }
      request.effectiveAt?.let { formValue0 ->
        form.add("effective_at", formValue0.toString())
      }
      request.emailType?.let { formValue0 ->
        form.add("email_type", formValue0.value)
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
      form.add("invoice", request.invoice)
      request.lines?.let { formValue0 ->
        if (formValue0.isEmpty()) {
          form.add("lines", "")
        } else {
          formValue0.forEachIndexed { formIndex1, formElement1 ->
            formElement1.amount?.let { formValue3 ->
              form.add("lines" + "[" + formIndex1 + "]" + "[amount]", formValue3.toString())
            }
            formElement1.description?.let { formValue3 ->
              form.add("lines" + "[" + formIndex1 + "]" + "[description]", formValue3)
            }
            formElement1.invoiceLineItem?.let { formValue3 ->
              form.add("lines" + "[" + formIndex1 + "]" + "[invoice_line_item]", formValue3)
            }
            formElement1.metadata?.let { formValue3 ->
              formValue3.forEach { (formKey4, formMapValue4) ->
                form.add("lines" + "[" + formIndex1 + "]" + "[metadata]" + "[" + formKey4 + "]", formMapValue4)
              }
            }
            formElement1.quantity?.let { formValue3 ->
              form.add("lines" + "[" + formIndex1 + "]" + "[quantity]", formValue3.toString())
            }
            formElement1.taxAmounts?.let { formValue3 ->
              require(formValue3.matchedBranches.size == 1) { "Form union value must match exactly one wire-kind branch" }
              when {
                formValue3.branch1 != null -> {
                  if (requireNotNull(formValue3.branch1).isEmpty()) {
                    form.add("lines" + "[" + formIndex1 + "]" + "[tax_amounts]", "")
                  } else {
                    requireNotNull(formValue3.branch1).forEachIndexed { formIndex5, formElement5 ->
                      form.add("lines" + "[" + formIndex1 + "]" + "[tax_amounts]" + "[" + formIndex5 + "]" + "[amount]", formElement5.amount.toString())
                      form.add("lines" + "[" + formIndex1 + "]" + "[tax_amounts]" + "[" + formIndex5 + "]" + "[tax_rate]", formElement5.taxRate)
                      form.add("lines" + "[" + formIndex1 + "]" + "[tax_amounts]" + "[" + formIndex5 + "]" + "[taxable_amount]", formElement5.taxableAmount.toString())
                    }
                  }
                }
                formValue3.inlineV1CreditNotesPostRequestFormLinesItemTaxAmountsAnyOf2Xb875d2dd != null -> {
                  form.add("lines" + "[" + formIndex1 + "]" + "[tax_amounts]", requireNotNull(formValue3.inlineV1CreditNotesPostRequestFormLinesItemTaxAmountsAnyOf2Xb875d2dd).value)
                }
                else -> {
                  error("Form union value has no selected branch")
                }
              }
            }
            formElement1.taxRates?.let { formValue3 ->
              require(formValue3.matchedBranches.size == 1) { "Form union value must match exactly one wire-kind branch" }
              when {
                formValue3.branch1 != null -> {
                  if (requireNotNull(formValue3.branch1).isEmpty()) {
                    form.add("lines" + "[" + formIndex1 + "]" + "[tax_rates]", "")
                  } else {
                    requireNotNull(formValue3.branch1).forEachIndexed { formIndex5, formElement5 ->
                      form.add("lines" + "[" + formIndex1 + "]" + "[tax_rates]" + "[" + formIndex5 + "]", formElement5)
                    }
                  }
                }
                formValue3.inlineV1CreditNotesPostRequestFormLinesItemTaxRatesAnyOf2Xe5c8d48d != null -> {
                  form.add("lines" + "[" + formIndex1 + "]" + "[tax_rates]", requireNotNull(formValue3.inlineV1CreditNotesPostRequestFormLinesItemTaxRatesAnyOf2Xe5c8d48d).value)
                }
                else -> {
                  error("Form union value has no selected branch")
                }
              }
            }
            form.add("lines" + "[" + formIndex1 + "]" + "[type]", formElement1.type.value)
            formElement1.unitAmount?.let { formValue3 ->
              form.add("lines" + "[" + formIndex1 + "]" + "[unit_amount]", formValue3.toString())
            }
            formElement1.unitAmountDecimal?.let { formValue3 ->
              form.add("lines" + "[" + formIndex1 + "]" + "[unit_amount_decimal]", formValue3)
            }
          }
        }
      }
      request.memo?.let { formValue0 ->
        form.add("memo", formValue0)
      }
      request.metadata?.let { formValue0 ->
        formValue0.forEach { (formKey1, formMapValue1) ->
          form.add("metadata" + "[" + formKey1 + "]", formMapValue1)
        }
      }
      request.outOfBandAmount?.let { formValue0 ->
        form.add("out_of_band_amount", formValue0.toString())
      }
      request.reason?.let { formValue0 ->
        form.add("reason", formValue0.value)
      }
      request.refundAmount?.let { formValue0 ->
        form.add("refund_amount", formValue0.toString())
      }
      request.refunds?.let { formValue0 ->
        if (formValue0.isEmpty()) {
          form.add("refunds", "")
        } else {
          formValue0.forEachIndexed { formIndex1, formElement1 ->
            formElement1.amountRefunded?.let { formValue3 ->
              form.add("refunds" + "[" + formIndex1 + "]" + "[amount_refunded]", formValue3.toString())
            }
            formElement1.paymentRecordRefund?.let { formValue3 ->
              form.add("refunds" + "[" + formIndex1 + "]" + "[payment_record_refund]" + "[payment_record]", formValue3.paymentRecord)
              form.add("refunds" + "[" + formIndex1 + "]" + "[payment_record_refund]" + "[refund_group]", formValue3.refundGroup)
            }
            formElement1.refund?.let { formValue3 ->
              form.add("refunds" + "[" + formIndex1 + "]" + "[refund]", formValue3)
            }
            formElement1.type?.let { formValue3 ->
              form.add("refunds" + "[" + formIndex1 + "]" + "[type]", formValue3.value)
            }
          }
        }
      }
      request.shippingCost?.let { formValue0 ->
        formValue0.shippingRate?.let { formValue2 ->
          form.add("shipping_cost" + "[shipping_rate]", formValue2)
        }
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1CreditNotesPostRequestFormXc40c1d58 {
      error("Form request codecs do not decode response bodies.")
    }
  }

  internal object PostCreditNotesIdFormCodec : MediaTypeCodec<InlineV1CreditNotesPostRequestFormX4f4c481e?> {
    override val id: String = "PostCreditNotesId.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1CreditNotesPostRequestFormX4f4c481e?, mediaType: String): SdkRequestBody {
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
      request.memo?.let { formValue0 ->
        form.add("memo", formValue0)
      }
      request.metadata?.let { formValue0 ->
        formValue0.forEach { (formKey1, formMapValue1) ->
          form.add("metadata" + "[" + formKey1 + "]", formMapValue1)
        }
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1CreditNotesPostRequestFormX4f4c481e? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  internal object PostCreditNotesIdVoidFormCodec : MediaTypeCodec<InlineV1CreditNotesVoidPostRequestFormX4419eb7c?> {
    override val id: String = "PostCreditNotesIdVoid.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1CreditNotesVoidPostRequestFormX4419eb7c?, mediaType: String): SdkRequestBody {
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
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1CreditNotesVoidPostRequestFormX4419eb7c? {
      error("Form request codecs do not decode response bodies.")
    }
  }
}

/**
 * Client for the 'credit_notes' group of Stripe API.
 */
public class CreditNotesClient(
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
      SdkExecutor(transport, authentication = this@CreditNotesClient.authentication)

  /**
   * <p>Returns a list of credit notes.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param created Only return credit notes that were created during the given date interval.
   * @param customer Only return credit notes for the customer specified by this customer ID.
   * @param customerAccount Only return credit notes for the account representing the customer specified by this account
   * ID.
   * @param endingBefore A cursor for use in pagination. `ending_before` is an object ID that defines your place in the
   * list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent
   * call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
   * @param expand Specifies which fields in the response should be expanded.
   * @param invoice Only return credit notes for the invoice specified by this invoice ID.
   * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is
   * 10.
   * @param startingAfter A cursor for use in pagination. `starting_after` is an object ID that defines your place in
   * the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent
   * call can include `starting_after=obj_foo` in order to fetch the next page of the list.
   * @param options Execution options.
   */
  public suspend fun getCreditNotesWithResponse(
    request: JsonObject? = null,
    created: InlineV1CreditNotesGetParameterXe79d31b2? = null,
    customer: String? = null,
    customerAccount: String? = null,
    endingBefore: String? = null,
    expand: List<String>? = null,
    invoice: String? = null,
    limit: Int? = null,
    startingAfter: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetCreditNotesResponse> = executor.executeWithResponse<JsonObject?, GetCreditNotesResponse>(SdkExecutionRequest(getCreditNotesMetadata, baseUri, request, listOf(CreditNotesCodecs.GETCREDITNOTES_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "created", values = created?.let { value ->
    val primitive = value.raw as? JsonPrimitive ?: error("Stripe-compatible deepObject scalar fallback requires a JSON primitive value")
    listOf(primitive.content)
    }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "customer", values = customer?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "customer_account", values = customerAccount?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "ending_before", values = endingBefore?.let { listOf(it.toString()) }.orEmpty()))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "invoice", values = invoice?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "starting_after", values = startingAfter?.let { listOf(it.toString()) }.orEmpty()))
  }), CreditNotesCodecs.getCreditNotesRequestCodecRegistry, GetCreditNotesResponseDecoder, options)

  /**
   * <p>When retrieving a credit note, you’ll get a <strong>lines</strong> property containing the first handful of
   * those items. There is also a URL where you can retrieve the full (paginated) list of line items.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param creditNote Wire parameter `credit_note`.
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
  public suspend fun getCreditNotesCreditNoteLinesWithResponse(
    request: JsonObject? = null,
    creditNote: String,
    endingBefore: String? = null,
    expand: List<String>? = null,
    limit: Int? = null,
    startingAfter: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetCreditNotesCreditNoteLinesResponse> = executor.executeWithResponse<JsonObject?, GetCreditNotesCreditNoteLinesResponse>(SdkExecutionRequest(getCreditNotesCreditNoteLinesMetadata, baseUri, request, listOf(CreditNotesCodecs.GETCREDITNOTESCREDITNOTELINES_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "credit_note", values = listOf(creditNote.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "ending_before", values = endingBefore?.let { listOf(it.toString()) }.orEmpty()))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "starting_after", values = startingAfter?.let { listOf(it.toString()) }.orEmpty()))
  }), CreditNotesCodecs.getCreditNotesCreditNoteLinesRequestCodecRegistry, GetCreditNotesCreditNoteLinesResponseDecoder, options)

  /**
   * <p>Retrieves the credit note object with the given identifier.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param id Wire parameter `id`.
   * @param expand Specifies which fields in the response should be expanded.
   * @param options Execution options.
   */
  public suspend fun getCreditNotesIdWithResponse(
    request: JsonObject? = null,
    id: String,
    expand: List<String>? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetCreditNotesIdResponse> = executor.executeWithResponse<JsonObject?, GetCreditNotesIdResponse>(SdkExecutionRequest(getCreditNotesIdMetadata, baseUri, request, listOf(CreditNotesCodecs.GETCREDITNOTESID_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
  }), CreditNotesCodecs.getCreditNotesIdRequestCodecRegistry, GetCreditNotesIdResponseDecoder, options)

  /**
   * <p>Issue a credit note to adjust the amount of a finalized invoice. A credit note will first reduce the invoice’s
   * <code>amount_remaining</code> (and <code>amount_due</code>), but not below zero.
   * This amount is indicated by the credit note’s <code>pre_payment_amount</code>. The excess amount is indicated by
   * <code>post_payment_amount</code>, and it can result in any combination of the following:</p>
   *
   * <ul>
   * <li>Refunds: create a new refund (using <code>refund_amount</code>) or link existing refunds (using
   * <code>refunds</code>).</li>
   * <li>Customer balance credit: credit the customer’s balance (using <code>credit_amount</code>) which will be
   * automatically applied to their next invoice when it’s finalized.</li>
   * <li>Outside of Stripe credit: record the amount that is or will be credited outside of Stripe (using
   * <code>out_of_band_amount</code>).</li>
   * </ul>
   *
   * <p>The sum of refunds, customer balance credits, and outside of Stripe credits must equal the
   * <code>post_payment_amount</code>.</p>
   *
   * <p>You may issue multiple credit notes for an invoice. Each credit note may increment the invoice’s
   * <code>pre_payment_credit_notes_amount</code>,
   * <code>post_payment_credit_notes_amount</code>, or both, depending on the invoice’s <code>amount_remaining</code> at
   * the time of credit note creation.</p>
   *
   * <p>For invoices that also have refunds created through the <a href="/docs/api/refunds">Refund API</a>, the credit
   * note API subtracts those refund amounts from the maximum creditable amount. This prevents the combined credit notes
   * and refunds from exceeding the invoice amount. If you use both, ensure the combined total does not exceed the
   * invoice’s paid amount.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param options Execution options.
   */
  public suspend fun postCreditNotesWithResponse(request: InlineV1CreditNotesPostRequestFormXc40c1d58, options: CallOptions = CallOptions()): SdkResponseResult<PostCreditNotesResponse> = executor.executeWithResponse<InlineV1CreditNotesPostRequestFormXc40c1d58, PostCreditNotesResponse>(SdkExecutionRequest(postCreditNotesMetadata, baseUri, request, listOf(CreditNotesCodecs.POSTCREDITNOTES_REQUEST_CODEC_ID), emptyList()), CreditNotesCodecs.postCreditNotesRequestCodecRegistry, PostCreditNotesResponseDecoder, options)

  /**
   * <p>Updates an existing credit note.</p>
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
  public suspend fun postCreditNotesIdWithResponse(
    request: InlineV1CreditNotesPostRequestFormX4f4c481e? = null,
    id: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostCreditNotesIdResponse> = executor.executeWithResponse<InlineV1CreditNotesPostRequestFormX4f4c481e?, PostCreditNotesIdResponse>(SdkExecutionRequest(postCreditNotesIdMetadata, baseUri, request, listOf(CreditNotesCodecs.POSTCREDITNOTESID_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
  }), CreditNotesCodecs.postCreditNotesIdRequestCodecRegistry, PostCreditNotesIdResponseDecoder, options)

  /**
   * <p>Marks a credit note as void. Learn more about <a href="/docs/billing/invoices/credit-notes#voiding">voiding
   * credit notes</a>.</p>
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
  public suspend fun postCreditNotesIdVoidWithResponse(
    request: InlineV1CreditNotesVoidPostRequestFormX4419eb7c? = null,
    id: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostCreditNotesIdVoidResponse> = executor.executeWithResponse<InlineV1CreditNotesVoidPostRequestFormX4419eb7c?, PostCreditNotesIdVoidResponse>(SdkExecutionRequest(postCreditNotesIdVoidMetadata, baseUri, request, listOf(CreditNotesCodecs.POSTCREDITNOTESIDVOID_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
  }), CreditNotesCodecs.postCreditNotesIdVoidRequestCodecRegistry, PostCreditNotesIdVoidResponseDecoder, options)

  /**
   * Typed response alternatives for `GetCreditNotes`. Non-success alternatives are not converted into success values.
   */
  public sealed interface GetCreditNotesResponse {
    public class SuccessJson(
      public val json: InlineV1CreditNotesGetResponse200JsonX78b47036,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetCreditNotesResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetCreditNotesResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetCreditNotesResponse
  }

  private object GetCreditNotesResponseDecoder : SdkResponseAlternativeDecoder<GetCreditNotesResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetCreditNotesResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetCreditNotesResponse> = when {
      alternative.id == "GetCreditNotes.response.alternative0" -> SdkResponseDecodeResult(
        value = GetCreditNotesResponse.SuccessJson(
          json = CreditNotesCodecs.getCreditNotesResponseCodecAlternative0Registry.select(listOf("GetCreditNotes.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetCreditNotes.response.alternative1" -> SdkResponseDecodeResult(
        value = GetCreditNotesResponse.DefaultJson(
          json = CreditNotesCodecs.getCreditNotesResponseCodecAlternative1Registry.select(listOf("GetCreditNotes.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetCreditNotesResponse = GetCreditNotesResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetCreditNotesCreditNoteLines`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface GetCreditNotesCreditNoteLinesResponse {
    public class SuccessJson(
      public val json: InlineV1CreditNotesLinesGetResponse200JsonXd936e84d,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetCreditNotesCreditNoteLinesResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetCreditNotesCreditNoteLinesResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetCreditNotesCreditNoteLinesResponse
  }

  private object GetCreditNotesCreditNoteLinesResponseDecoder : SdkResponseAlternativeDecoder<GetCreditNotesCreditNoteLinesResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetCreditNotesCreditNoteLinesResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetCreditNotesCreditNoteLinesResponse> = when {
      alternative.id == "GetCreditNotesCreditNoteLines.response.alternative0" -> SdkResponseDecodeResult(
        value = GetCreditNotesCreditNoteLinesResponse.SuccessJson(
          json = CreditNotesCodecs.getCreditNotesCreditNoteLinesResponseCodecAlternative0Registry.select(listOf("GetCreditNotesCreditNoteLines.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetCreditNotesCreditNoteLines.response.alternative1" -> SdkResponseDecodeResult(
        value = GetCreditNotesCreditNoteLinesResponse.DefaultJson(
          json = CreditNotesCodecs.getCreditNotesCreditNoteLinesResponseCodecAlternative1Registry.select(listOf("GetCreditNotesCreditNoteLines.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetCreditNotesCreditNoteLinesResponse = GetCreditNotesCreditNoteLinesResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetCreditNotesId`. Non-success alternatives are not converted into success values.
   */
  public sealed interface GetCreditNotesIdResponse {
    public class SuccessJson(
      public val json: CreditNote,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetCreditNotesIdResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetCreditNotesIdResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetCreditNotesIdResponse
  }

  private object GetCreditNotesIdResponseDecoder : SdkResponseAlternativeDecoder<GetCreditNotesIdResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetCreditNotesIdResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetCreditNotesIdResponse> = when {
      alternative.id == "GetCreditNotesId.response.alternative0" -> SdkResponseDecodeResult(
        value = GetCreditNotesIdResponse.SuccessJson(
          json = CreditNotesCodecs.getCreditNotesIdResponseCodecAlternative0Registry.select(listOf("GetCreditNotesId.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetCreditNotesId.response.alternative1" -> SdkResponseDecodeResult(
        value = GetCreditNotesIdResponse.DefaultJson(
          json = CreditNotesCodecs.getCreditNotesIdResponseCodecAlternative1Registry.select(listOf("GetCreditNotesId.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetCreditNotesIdResponse = GetCreditNotesIdResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostCreditNotes`. Non-success alternatives are not converted into success values.
   */
  public sealed interface PostCreditNotesResponse {
    public class SuccessJson(
      public val json: CreditNote,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostCreditNotesResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostCreditNotesResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostCreditNotesResponse
  }

  private object PostCreditNotesResponseDecoder : SdkResponseAlternativeDecoder<PostCreditNotesResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostCreditNotesResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostCreditNotesResponse> = when {
      alternative.id == "PostCreditNotes.response.alternative0" -> SdkResponseDecodeResult(
        value = PostCreditNotesResponse.SuccessJson(
          json = CreditNotesCodecs.postCreditNotesResponseCodecAlternative0Registry.select(listOf("PostCreditNotes.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostCreditNotes.response.alternative1" -> SdkResponseDecodeResult(
        value = PostCreditNotesResponse.DefaultJson(
          json = CreditNotesCodecs.postCreditNotesResponseCodecAlternative1Registry.select(listOf("PostCreditNotes.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostCreditNotesResponse = PostCreditNotesResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostCreditNotesId`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface PostCreditNotesIdResponse {
    public class SuccessJson(
      public val json: CreditNote,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostCreditNotesIdResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostCreditNotesIdResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostCreditNotesIdResponse
  }

  private object PostCreditNotesIdResponseDecoder : SdkResponseAlternativeDecoder<PostCreditNotesIdResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostCreditNotesIdResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostCreditNotesIdResponse> = when {
      alternative.id == "PostCreditNotesId.response.alternative0" -> SdkResponseDecodeResult(
        value = PostCreditNotesIdResponse.SuccessJson(
          json = CreditNotesCodecs.postCreditNotesIdResponseCodecAlternative0Registry.select(listOf("PostCreditNotesId.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostCreditNotesId.response.alternative1" -> SdkResponseDecodeResult(
        value = PostCreditNotesIdResponse.DefaultJson(
          json = CreditNotesCodecs.postCreditNotesIdResponseCodecAlternative1Registry.select(listOf("PostCreditNotesId.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostCreditNotesIdResponse = PostCreditNotesIdResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostCreditNotesIdVoid`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface PostCreditNotesIdVoidResponse {
    public class SuccessJson(
      public val json: CreditNote,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostCreditNotesIdVoidResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostCreditNotesIdVoidResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostCreditNotesIdVoidResponse
  }

  private object PostCreditNotesIdVoidResponseDecoder : SdkResponseAlternativeDecoder<PostCreditNotesIdVoidResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostCreditNotesIdVoidResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostCreditNotesIdVoidResponse> = when {
      alternative.id == "PostCreditNotesIdVoid.response.alternative0" -> SdkResponseDecodeResult(
        value = PostCreditNotesIdVoidResponse.SuccessJson(
          json = CreditNotesCodecs.postCreditNotesIdVoidResponseCodecAlternative0Registry.select(listOf("PostCreditNotesIdVoid.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostCreditNotesIdVoid.response.alternative1" -> SdkResponseDecodeResult(
        value = PostCreditNotesIdVoidResponse.DefaultJson(
          json = CreditNotesCodecs.postCreditNotesIdVoidResponseCodecAlternative1Registry.select(listOf("PostCreditNotesIdVoid.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostCreditNotesIdVoidResponse = PostCreditNotesIdVoidResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    internal val getCreditNotesMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetCreditNotes",
          method = "GET",
          path = "/v1/credit_notes",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1CreditNotesGetResponse200JsonX78b47036",
              mode = SdkResponseMode.BUFFERED,
              id = "GetCreditNotes.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetCreditNotes.response.alternative1",
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

    internal val getCreditNotesCreditNoteLinesMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetCreditNotesCreditNoteLines",
          method = "GET",
          path = "/v1/credit_notes/{credit_note}/lines",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1CreditNotesLinesGetResponse200JsonXd936e84d",
              mode = SdkResponseMode.BUFFERED,
              id = "GetCreditNotesCreditNoteLines.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetCreditNotesCreditNoteLines.response.alternative1",
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

    internal val getCreditNotesIdMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetCreditNotesId",
          method = "GET",
          path = "/v1/credit_notes/{id}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "CreditNote",
              mode = SdkResponseMode.BUFFERED,
              id = "GetCreditNotesId.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetCreditNotesId.response.alternative1",
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

    internal val postCreditNotesMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostCreditNotes",
          method = "POST",
          path = "/v1/credit_notes",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "CreditNote",
              mode = SdkResponseMode.BUFFERED,
              id = "PostCreditNotes.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostCreditNotes.response.alternative1",
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

    internal val postCreditNotesIdMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostCreditNotesId",
          method = "POST",
          path = "/v1/credit_notes/{id}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "CreditNote",
              mode = SdkResponseMode.BUFFERED,
              id = "PostCreditNotesId.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostCreditNotesId.response.alternative1",
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

    internal val postCreditNotesIdVoidMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostCreditNotesIdVoid",
          method = "POST",
          path = "/v1/credit_notes/{id}/void",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "CreditNote",
              mode = SdkResponseMode.BUFFERED,
              id = "PostCreditNotesIdVoid.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostCreditNotesIdVoid.response.alternative1",
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
