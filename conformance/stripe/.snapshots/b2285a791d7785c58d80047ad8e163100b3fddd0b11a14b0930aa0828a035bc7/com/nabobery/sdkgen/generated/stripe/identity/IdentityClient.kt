package com.nabobery.sdkgen.generated.stripe.identity

import com.nabobery.sdkgen.generated.stripe.Error
import com.nabobery.sdkgen.generated.stripe.IdentityVerificationReport
import com.nabobery.sdkgen.generated.stripe.IdentityVerificationSession
import com.nabobery.sdkgen.generated.stripe.InlineV1IdentityVerificationReportsGetParameterX10661f59
import com.nabobery.sdkgen.generated.stripe.InlineV1IdentityVerificationReportsGetParameterXb3ffcb97
import com.nabobery.sdkgen.generated.stripe.InlineV1IdentityVerificationReportsGetResponse200JsonXae823fe9
import com.nabobery.sdkgen.generated.stripe.InlineV1IdentityVerificationSessionsCancelPostRequestFormX96e70eec
import com.nabobery.sdkgen.generated.stripe.InlineV1IdentityVerificationSessionsGetParameterX8eff346e
import com.nabobery.sdkgen.generated.stripe.InlineV1IdentityVerificationSessionsGetParameterX9b23c2bb
import com.nabobery.sdkgen.generated.stripe.InlineV1IdentityVerificationSessionsGetResponse200JsonX40a2b175
import com.nabobery.sdkgen.generated.stripe.InlineV1IdentityVerificationSessionsPostRequestFormX0c6f0bda
import com.nabobery.sdkgen.generated.stripe.InlineV1IdentityVerificationSessionsPostRequestFormX2f3ccf77
import com.nabobery.sdkgen.generated.stripe.InlineV1IdentityVerificationSessionsRedactPostRequestFormX31077106
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
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.collections.Set
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive

public object IdentityCodecs {
  public const val GETIDENTITYVERIFICATIONREPORTS_REQUEST_CODEC_ID: String =
      "GetIdentityVerificationReports.request"

  private val getIdentityVerificationReportsRequestCodec: MediaTypeCodec<JsonObject?> =
      GetIdentityVerificationReportsFormCodec

  private val getIdentityVerificationReportsResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1IdentityVerificationReportsGetResponse200JsonXae823fe9> =
      KotlinxSerializationCodec("GetIdentityVerificationReports.response.alternative0", InlineV1IdentityVerificationReportsGetResponse200JsonXae823fe9.Serializer, SdkJson)

  public val getIdentityVerificationReportsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1IdentityVerificationReportsGetResponse200JsonXae823fe9> =
      MediaTypeCodecRegistry.of(getIdentityVerificationReportsResponseCodecAlternative0Codec)

  private val getIdentityVerificationReportsResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetIdentityVerificationReports.response.alternative1", Error.Serializer, SdkJson)

  public val getIdentityVerificationReportsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getIdentityVerificationReportsResponseCodecAlternative1Codec)

  public val getIdentityVerificationReportsRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?>
      = MediaTypeCodecRegistry.of(getIdentityVerificationReportsRequestCodec)

  public const val GETIDENTITYVERIFICATIONREPORTSREPORT_REQUEST_CODEC_ID: String =
      "GetIdentityVerificationReportsReport.request"

  private val getIdentityVerificationReportsReportRequestCodec: MediaTypeCodec<JsonObject?> =
      GetIdentityVerificationReportsReportFormCodec

  private val getIdentityVerificationReportsReportResponseCodecAlternative0Codec:
      MediaTypeCodec<IdentityVerificationReport> =
      KotlinxSerializationCodec("GetIdentityVerificationReportsReport.response.alternative0", IdentityVerificationReport.Serializer, SdkJson)

  public val getIdentityVerificationReportsReportResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<IdentityVerificationReport> =
      MediaTypeCodecRegistry.of(getIdentityVerificationReportsReportResponseCodecAlternative0Codec)

  private val getIdentityVerificationReportsReportResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetIdentityVerificationReportsReport.response.alternative1", Error.Serializer, SdkJson)

  public val getIdentityVerificationReportsReportResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getIdentityVerificationReportsReportResponseCodecAlternative1Codec)

  public val getIdentityVerificationReportsReportRequestCodecRegistry:
      MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getIdentityVerificationReportsReportRequestCodec)

  public const val GETIDENTITYVERIFICATIONSESSIONS_REQUEST_CODEC_ID: String =
      "GetIdentityVerificationSessions.request"

  private val getIdentityVerificationSessionsRequestCodec: MediaTypeCodec<JsonObject?> =
      GetIdentityVerificationSessionsFormCodec

  private val getIdentityVerificationSessionsResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1IdentityVerificationSessionsGetResponse200JsonX40a2b175> =
      KotlinxSerializationCodec("GetIdentityVerificationSessions.response.alternative0", InlineV1IdentityVerificationSessionsGetResponse200JsonX40a2b175.Serializer, SdkJson)

  public val getIdentityVerificationSessionsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1IdentityVerificationSessionsGetResponse200JsonX40a2b175> =
      MediaTypeCodecRegistry.of(getIdentityVerificationSessionsResponseCodecAlternative0Codec)

  private val getIdentityVerificationSessionsResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetIdentityVerificationSessions.response.alternative1", Error.Serializer, SdkJson)

  public val getIdentityVerificationSessionsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getIdentityVerificationSessionsResponseCodecAlternative1Codec)

  public val getIdentityVerificationSessionsRequestCodecRegistry:
      MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getIdentityVerificationSessionsRequestCodec)

  public const val GETIDENTITYVERIFICATIONSESSIONSSESSION_REQUEST_CODEC_ID: String =
      "GetIdentityVerificationSessionsSession.request"

  private val getIdentityVerificationSessionsSessionRequestCodec: MediaTypeCodec<JsonObject?> =
      GetIdentityVerificationSessionsSessionFormCodec

  private val getIdentityVerificationSessionsSessionResponseCodecAlternative0Codec:
      MediaTypeCodec<IdentityVerificationSession> =
      KotlinxSerializationCodec("GetIdentityVerificationSessionsSession.response.alternative0", IdentityVerificationSession.Serializer, SdkJson)

  public val getIdentityVerificationSessionsSessionResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<IdentityVerificationSession> =
      MediaTypeCodecRegistry.of(getIdentityVerificationSessionsSessionResponseCodecAlternative0Codec)

  private val getIdentityVerificationSessionsSessionResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetIdentityVerificationSessionsSession.response.alternative1", Error.Serializer, SdkJson)

  public val getIdentityVerificationSessionsSessionResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getIdentityVerificationSessionsSessionResponseCodecAlternative1Codec)

  public val getIdentityVerificationSessionsSessionRequestCodecRegistry:
      MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getIdentityVerificationSessionsSessionRequestCodec)

  public const val POSTIDENTITYVERIFICATIONSESSIONS_REQUEST_CODEC_ID: String =
      "PostIdentityVerificationSessions.request"

  private val postIdentityVerificationSessionsRequestCodec:
      MediaTypeCodec<InlineV1IdentityVerificationSessionsPostRequestFormX0c6f0bda?> =
      PostIdentityVerificationSessionsFormCodec

  private val postIdentityVerificationSessionsResponseCodecAlternative0Codec:
      MediaTypeCodec<IdentityVerificationSession> =
      KotlinxSerializationCodec("PostIdentityVerificationSessions.response.alternative0", IdentityVerificationSession.Serializer, SdkJson)

  public val postIdentityVerificationSessionsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<IdentityVerificationSession> =
      MediaTypeCodecRegistry.of(postIdentityVerificationSessionsResponseCodecAlternative0Codec)

  private val postIdentityVerificationSessionsResponseCodecAlternative1Codec: MediaTypeCodec<Error>
      =
      KotlinxSerializationCodec("PostIdentityVerificationSessions.response.alternative1", Error.Serializer, SdkJson)

  public val postIdentityVerificationSessionsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postIdentityVerificationSessionsResponseCodecAlternative1Codec)

  public val postIdentityVerificationSessionsRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1IdentityVerificationSessionsPostRequestFormX0c6f0bda?> =
      MediaTypeCodecRegistry.of(postIdentityVerificationSessionsRequestCodec)

  public const val POSTIDENTITYVERIFICATIONSESSIONSSESSION_REQUEST_CODEC_ID: String =
      "PostIdentityVerificationSessionsSession.request"

  private val postIdentityVerificationSessionsSessionRequestCodec:
      MediaTypeCodec<InlineV1IdentityVerificationSessionsPostRequestFormX2f3ccf77?> =
      PostIdentityVerificationSessionsSessionFormCodec

  private val postIdentityVerificationSessionsSessionResponseCodecAlternative0Codec:
      MediaTypeCodec<IdentityVerificationSession> =
      KotlinxSerializationCodec("PostIdentityVerificationSessionsSession.response.alternative0", IdentityVerificationSession.Serializer, SdkJson)

  public val postIdentityVerificationSessionsSessionResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<IdentityVerificationSession> =
      MediaTypeCodecRegistry.of(postIdentityVerificationSessionsSessionResponseCodecAlternative0Codec)

  private val postIdentityVerificationSessionsSessionResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostIdentityVerificationSessionsSession.response.alternative1", Error.Serializer, SdkJson)

  public val postIdentityVerificationSessionsSessionResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postIdentityVerificationSessionsSessionResponseCodecAlternative1Codec)

  public val postIdentityVerificationSessionsSessionRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1IdentityVerificationSessionsPostRequestFormX2f3ccf77?> =
      MediaTypeCodecRegistry.of(postIdentityVerificationSessionsSessionRequestCodec)

  public const val POSTIDENTITYVERIFICATIONSESSIONSSESSIONCANCEL_REQUEST_CODEC_ID: String =
      "PostIdentityVerificationSessionsSessionCancel.request"

  private val postIdentityVerificationSessionsSessionCancelRequestCodec:
      MediaTypeCodec<InlineV1IdentityVerificationSessionsCancelPostRequestFormX96e70eec?> =
      PostIdentityVerificationSessionsSessionCancelFormCodec

  private val postIdentityVerificationSessionsSessionCancelResponseCodecAlternative0Codec:
      MediaTypeCodec<IdentityVerificationSession> =
      KotlinxSerializationCodec("PostIdentityVerificationSessionsSessionCancel.response.alternative0", IdentityVerificationSession.Serializer, SdkJson)

  public val postIdentityVerificationSessionsSessionCancelResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<IdentityVerificationSession> =
      MediaTypeCodecRegistry.of(postIdentityVerificationSessionsSessionCancelResponseCodecAlternative0Codec)

  private val postIdentityVerificationSessionsSessionCancelResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostIdentityVerificationSessionsSessionCancel.response.alternative1", Error.Serializer, SdkJson)

  public val postIdentityVerificationSessionsSessionCancelResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postIdentityVerificationSessionsSessionCancelResponseCodecAlternative1Codec)

  public val postIdentityVerificationSessionsSessionCancelRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1IdentityVerificationSessionsCancelPostRequestFormX96e70eec?> =
      MediaTypeCodecRegistry.of(postIdentityVerificationSessionsSessionCancelRequestCodec)

  public const val POSTIDENTITYVERIFICATIONSESSIONSSESSIONREDACT_REQUEST_CODEC_ID: String =
      "PostIdentityVerificationSessionsSessionRedact.request"

  private val postIdentityVerificationSessionsSessionRedactRequestCodec:
      MediaTypeCodec<InlineV1IdentityVerificationSessionsRedactPostRequestFormX31077106?> =
      PostIdentityVerificationSessionsSessionRedactFormCodec

  private val postIdentityVerificationSessionsSessionRedactResponseCodecAlternative0Codec:
      MediaTypeCodec<IdentityVerificationSession> =
      KotlinxSerializationCodec("PostIdentityVerificationSessionsSessionRedact.response.alternative0", IdentityVerificationSession.Serializer, SdkJson)

  public val postIdentityVerificationSessionsSessionRedactResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<IdentityVerificationSession> =
      MediaTypeCodecRegistry.of(postIdentityVerificationSessionsSessionRedactResponseCodecAlternative0Codec)

  private val postIdentityVerificationSessionsSessionRedactResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostIdentityVerificationSessionsSessionRedact.response.alternative1", Error.Serializer, SdkJson)

  public val postIdentityVerificationSessionsSessionRedactResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postIdentityVerificationSessionsSessionRedactResponseCodecAlternative1Codec)

  public val postIdentityVerificationSessionsSessionRedactRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1IdentityVerificationSessionsRedactPostRequestFormX31077106?> =
      MediaTypeCodecRegistry.of(postIdentityVerificationSessionsSessionRedactRequestCodec)

  public object GetIdentityVerificationReportsFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetIdentityVerificationReports.request"

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

  public object GetIdentityVerificationReportsReportFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetIdentityVerificationReportsReport.request"

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

  public object GetIdentityVerificationSessionsFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetIdentityVerificationSessions.request"

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

  public object GetIdentityVerificationSessionsSessionFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetIdentityVerificationSessionsSession.request"

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

  public object PostIdentityVerificationSessionsFormCodec : MediaTypeCodec<InlineV1IdentityVerificationSessionsPostRequestFormX0c6f0bda?> {
    override val id: String = "PostIdentityVerificationSessions.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1IdentityVerificationSessionsPostRequestFormX0c6f0bda?, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      request.clientReferenceId?.let { formValue0 ->
        form.add("client_reference_id", formValue0)
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
        formValue0.forEach { (formKey1, formMapValue1) ->
          form.add("metadata" + "[" + formKey1 + "]", formMapValue1)
        }
      }
      request.options?.let { formValue0 ->
        formValue0.document?.let { formValue2 ->
          require(formValue2.matchedBranches.size == 1) { "Form union value must match exactly one wire-kind branch" }
          when {
            formValue2.inlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf1X48bf9ed9 != null -> {
              requireNotNull(formValue2.inlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf1X48bf9ed9).allowedTypes?.let { formValue5 ->
                if (formValue5.isEmpty()) {
                  form.add("options" + "[document]" + "[allowed_types]", "")
                } else {
                  formValue5.forEachIndexed { formIndex6, formElement6 ->
                    form.add("options" + "[document]" + "[allowed_types]" + "[" + formIndex6 + "]", formElement6.value)
                  }
                }
              }
              requireNotNull(formValue2.inlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf1X48bf9ed9).requireIdNumber?.let { formValue5 ->
                form.add("options" + "[document]" + "[require_id_number]", formValue5.toString())
              }
              requireNotNull(formValue2.inlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf1X48bf9ed9).requireLiveCapture?.let { formValue5 ->
                form.add("options" + "[document]" + "[require_live_capture]", formValue5.toString())
              }
              requireNotNull(formValue2.inlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf1X48bf9ed9).requireMatchingSelfie?.let { formValue5 ->
                form.add("options" + "[document]" + "[require_matching_selfie]", formValue5.toString())
              }
            }
            formValue2.inlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf2X3b77c443 != null -> {
              form.add("options" + "[document]", requireNotNull(formValue2.inlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf2X3b77c443).value)
            }
            else -> {
              error("Form union value has no selected branch")
            }
          }
        }
      }
      request.providedDetails?.let { formValue0 ->
        formValue0.email?.let { formValue2 ->
          form.add("provided_details" + "[email]", formValue2)
        }
        formValue0.phone?.let { formValue2 ->
          form.add("provided_details" + "[phone]", formValue2)
        }
      }
      request.relatedCustomer?.let { formValue0 ->
        form.add("related_customer", formValue0)
      }
      request.relatedCustomerAccount?.let { formValue0 ->
        form.add("related_customer_account", formValue0)
      }
      request.relatedPerson?.let { formValue0 ->
        form.add("related_person" + "[account]", formValue0.account)
        form.add("related_person" + "[person]", formValue0.person)
      }
      request.returnUrl?.let { formValue0 ->
        form.add("return_url", formValue0)
      }
      request.type?.let { formValue0 ->
        form.add("type", formValue0.value)
      }
      request.verificationFlow?.let { formValue0 ->
        form.add("verification_flow", formValue0)
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1IdentityVerificationSessionsPostRequestFormX0c6f0bda? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  public object PostIdentityVerificationSessionsSessionFormCodec : MediaTypeCodec<InlineV1IdentityVerificationSessionsPostRequestFormX2f3ccf77?> {
    override val id: String = "PostIdentityVerificationSessionsSession.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1IdentityVerificationSessionsPostRequestFormX2f3ccf77?, mediaType: String): SdkRequestBody {
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
        formValue0.forEach { (formKey1, formMapValue1) ->
          form.add("metadata" + "[" + formKey1 + "]", formMapValue1)
        }
      }
      request.options?.let { formValue0 ->
        formValue0.document?.let { formValue2 ->
          require(formValue2.matchedBranches.size == 1) { "Form union value must match exactly one wire-kind branch" }
          when {
            formValue2.inlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf1Xce121586 != null -> {
              requireNotNull(formValue2.inlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf1Xce121586).allowedTypes?.let { formValue5 ->
                if (formValue5.isEmpty()) {
                  form.add("options" + "[document]" + "[allowed_types]", "")
                } else {
                  formValue5.forEachIndexed { formIndex6, formElement6 ->
                    form.add("options" + "[document]" + "[allowed_types]" + "[" + formIndex6 + "]", formElement6.value)
                  }
                }
              }
              requireNotNull(formValue2.inlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf1Xce121586).requireIdNumber?.let { formValue5 ->
                form.add("options" + "[document]" + "[require_id_number]", formValue5.toString())
              }
              requireNotNull(formValue2.inlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf1Xce121586).requireLiveCapture?.let { formValue5 ->
                form.add("options" + "[document]" + "[require_live_capture]", formValue5.toString())
              }
              requireNotNull(formValue2.inlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf1Xce121586).requireMatchingSelfie?.let { formValue5 ->
                form.add("options" + "[document]" + "[require_matching_selfie]", formValue5.toString())
              }
            }
            formValue2.inlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf2X9d4c6c1b != null -> {
              form.add("options" + "[document]", requireNotNull(formValue2.inlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf2X9d4c6c1b).value)
            }
            else -> {
              error("Form union value has no selected branch")
            }
          }
        }
      }
      request.providedDetails?.let { formValue0 ->
        formValue0.email?.let { formValue2 ->
          form.add("provided_details" + "[email]", formValue2)
        }
        formValue0.phone?.let { formValue2 ->
          form.add("provided_details" + "[phone]", formValue2)
        }
      }
      request.type?.let { formValue0 ->
        form.add("type", formValue0.value)
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1IdentityVerificationSessionsPostRequestFormX2f3ccf77? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  public object PostIdentityVerificationSessionsSessionCancelFormCodec : MediaTypeCodec<InlineV1IdentityVerificationSessionsCancelPostRequestFormX96e70eec?> {
    override val id: String = "PostIdentityVerificationSessionsSessionCancel.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1IdentityVerificationSessionsCancelPostRequestFormX96e70eec?, mediaType: String): SdkRequestBody {
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

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1IdentityVerificationSessionsCancelPostRequestFormX96e70eec? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  public object PostIdentityVerificationSessionsSessionRedactFormCodec : MediaTypeCodec<InlineV1IdentityVerificationSessionsRedactPostRequestFormX31077106?> {
    override val id: String = "PostIdentityVerificationSessionsSessionRedact.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1IdentityVerificationSessionsRedactPostRequestFormX31077106?, mediaType: String): SdkRequestBody {
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

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1IdentityVerificationSessionsRedactPostRequestFormX31077106? {
      error("Form request codecs do not decode response bodies.")
    }
  }
}

/**
 * Client for the 'identity' group of Stripe API.
 */
public class IdentityClient(
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
      SdkExecutor(transport, authentication = this@IdentityClient.authentication)

  /**
   * <p>List all verification reports.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param clientReferenceId A string to reference this user. This can be a customer ID, a session ID, or similar, and
   * can be used to reconcile this verification with your internal systems.
   * @param created Only return VerificationReports that were created during the given date interval.
   * @param endingBefore A cursor for use in pagination. `ending_before` is an object ID that defines your place in the
   * list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent
   * call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
   * @param expand Specifies which fields in the response should be expanded.
   * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is
   * 10.
   * @param startingAfter A cursor for use in pagination. `starting_after` is an object ID that defines your place in
   * the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent
   * call can include `starting_after=obj_foo` in order to fetch the next page of the list.
   * @param type Only return VerificationReports of this type
   * @param verificationSession Only return VerificationReports created by this VerificationSession ID. It is allowed to
   * provide a VerificationIntent ID.
   * @param options Execution options.
   */
  public suspend fun getIdentityVerificationReportsWithResponse(
    request: JsonObject? = null,
    clientReferenceId: String? = null,
    created: InlineV1IdentityVerificationReportsGetParameterX10661f59? = null,
    endingBefore: String? = null,
    expand: List<String>? = null,
    limit: Int? = null,
    startingAfter: String? = null,
    type: InlineV1IdentityVerificationReportsGetParameterXb3ffcb97? = null,
    verificationSession: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetIdentityVerificationReportsResponse> = executor.executeWithResponse<JsonObject?, GetIdentityVerificationReportsResponse>(SdkExecutionRequest(getIdentityVerificationReportsMetadata, baseUri, request, listOf(IdentityCodecs.GETIDENTITYVERIFICATIONREPORTS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "client_reference_id", values = clientReferenceId?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "created", values = created?.let { value ->
    val primitive = value.raw as? JsonPrimitive ?: error("Stripe-compatible deepObject scalar fallback requires a JSON primitive value")
    listOf(primitive.content)
    }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "ending_before", values = endingBefore?.let { listOf(it.toString()) }.orEmpty()))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "starting_after", values = startingAfter?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "type", values = type?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "verification_session", values = verificationSession?.let { listOf(it.toString()) }.orEmpty()))
  }), IdentityCodecs.getIdentityVerificationReportsRequestCodecRegistry, GetIdentityVerificationReportsResponseDecoder, options)

  /**
   * <p>Retrieves an existing VerificationReport</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param report Wire parameter `report`.
   * @param expand Specifies which fields in the response should be expanded.
   * @param options Execution options.
   */
  public suspend fun getIdentityVerificationReportsReportWithResponse(
    request: JsonObject? = null,
    report: String,
    expand: List<String>? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetIdentityVerificationReportsReportResponse> = executor.executeWithResponse<JsonObject?, GetIdentityVerificationReportsReportResponse>(SdkExecutionRequest(getIdentityVerificationReportsReportMetadata, baseUri, request, listOf(IdentityCodecs.GETIDENTITYVERIFICATIONREPORTSREPORT_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "report", values = listOf(report.toString())))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
  }), IdentityCodecs.getIdentityVerificationReportsReportRequestCodecRegistry, GetIdentityVerificationReportsReportResponseDecoder, options)

  /**
   * <p>Returns a list of VerificationSessions</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param clientReferenceId A string to reference this user. This can be a customer ID, a session ID, or similar, and
   * can be used to reconcile this verification with your internal systems.
   * @param created Only return VerificationSessions that were created during the given date interval.
   * @param endingBefore A cursor for use in pagination. `ending_before` is an object ID that defines your place in the
   * list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent
   * call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
   * @param expand Specifies which fields in the response should be expanded.
   * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is
   * 10.
   * @param relatedCustomer Customer ID
   * @param relatedCustomerAccount The ID of the Account representing a customer.
   * @param startingAfter A cursor for use in pagination. `starting_after` is an object ID that defines your place in
   * the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent
   * call can include `starting_after=obj_foo` in order to fetch the next page of the list.
   * @param status Only return VerificationSessions with this status. [Learn more about the lifecycle of
   * sessions](https://docs.stripe.com/identity/how-sessions-work).
   * @param options Execution options.
   */
  public suspend fun getIdentityVerificationSessionsWithResponse(
    request: JsonObject? = null,
    clientReferenceId: String? = null,
    created: InlineV1IdentityVerificationSessionsGetParameterX9b23c2bb? = null,
    endingBefore: String? = null,
    expand: List<String>? = null,
    limit: Int? = null,
    relatedCustomer: String? = null,
    relatedCustomerAccount: String? = null,
    startingAfter: String? = null,
    status: InlineV1IdentityVerificationSessionsGetParameterX8eff346e? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetIdentityVerificationSessionsResponse> = executor.executeWithResponse<JsonObject?, GetIdentityVerificationSessionsResponse>(SdkExecutionRequest(getIdentityVerificationSessionsMetadata, baseUri, request, listOf(IdentityCodecs.GETIDENTITYVERIFICATIONSESSIONS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "client_reference_id", values = clientReferenceId?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "created", values = created?.let { value ->
    val primitive = value.raw as? JsonPrimitive ?: error("Stripe-compatible deepObject scalar fallback requires a JSON primitive value")
    listOf(primitive.content)
    }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "ending_before", values = endingBefore?.let { listOf(it.toString()) }.orEmpty()))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "related_customer", values = relatedCustomer?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "related_customer_account", values = relatedCustomerAccount?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "starting_after", values = startingAfter?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "status", values = status?.let { listOf(it.toString()) }.orEmpty()))
  }), IdentityCodecs.getIdentityVerificationSessionsRequestCodecRegistry, GetIdentityVerificationSessionsResponseDecoder, options)

  /**
   * <p>Retrieves the details of a VerificationSession that was previously created.</p>
   *
   * <p>When the session status is <code>requires_input</code>, you can use this method to retrieve a valid
   * <code>client_secret</code> or <code>url</code> to allow re-submission.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param session Wire parameter `session`.
   * @param expand Specifies which fields in the response should be expanded.
   * @param options Execution options.
   */
  public suspend fun getIdentityVerificationSessionsSessionWithResponse(
    request: JsonObject? = null,
    session: String,
    expand: List<String>? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetIdentityVerificationSessionsSessionResponse> = executor.executeWithResponse<JsonObject?, GetIdentityVerificationSessionsSessionResponse>(SdkExecutionRequest(getIdentityVerificationSessionsSessionMetadata, baseUri, request, listOf(IdentityCodecs.GETIDENTITYVERIFICATIONSESSIONSSESSION_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "session", values = listOf(session.toString())))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
  }), IdentityCodecs.getIdentityVerificationSessionsSessionRequestCodecRegistry, GetIdentityVerificationSessionsSessionResponseDecoder, options)

  /**
   * <p>Creates a VerificationSession object.</p>
   *
   * <p>After the VerificationSession is created, display a verification modal using the session
   * <code>client_secret</code> or send your users to the session’s <code>url</code>.</p>
   *
   * <p>If your API key is in test mode, verification checks won’t actually process, though everything else will occur
   * as if in live mode.</p>
   *
   * <p>Related guide: <a href="/docs/identity/verify-identity-documents">Verify your users’ identity documents</a></p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param options Execution options.
   */
  public suspend fun postIdentityVerificationSessionsWithResponse(request: InlineV1IdentityVerificationSessionsPostRequestFormX0c6f0bda? = null, options: CallOptions = CallOptions()): SdkResponseResult<PostIdentityVerificationSessionsResponse> = executor.executeWithResponse<InlineV1IdentityVerificationSessionsPostRequestFormX0c6f0bda?, PostIdentityVerificationSessionsResponse>(SdkExecutionRequest(postIdentityVerificationSessionsMetadata, baseUri, request, listOf(IdentityCodecs.POSTIDENTITYVERIFICATIONSESSIONS_REQUEST_CODEC_ID), emptyList()), IdentityCodecs.postIdentityVerificationSessionsRequestCodecRegistry, PostIdentityVerificationSessionsResponseDecoder, options)

  /**
   * <p>Updates a VerificationSession object.</p>
   *
   * <p>When the session status is <code>requires_input</code>, you can use this method to update the
   * verification check and options.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param session Wire parameter `session`.
   * @param options Execution options.
   */
  public suspend fun postIdentityVerificationSessionsSessionWithResponse(
    request: InlineV1IdentityVerificationSessionsPostRequestFormX2f3ccf77? = null,
    session: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostIdentityVerificationSessionsSessionResponse> = executor.executeWithResponse<InlineV1IdentityVerificationSessionsPostRequestFormX2f3ccf77?, PostIdentityVerificationSessionsSessionResponse>(SdkExecutionRequest(postIdentityVerificationSessionsSessionMetadata, baseUri, request, listOf(IdentityCodecs.POSTIDENTITYVERIFICATIONSESSIONSSESSION_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "session", values = listOf(session.toString())))
  }), IdentityCodecs.postIdentityVerificationSessionsSessionRequestCodecRegistry, PostIdentityVerificationSessionsSessionResponseDecoder, options)

  /**
   * <p>A VerificationSession object can be canceled when it is in <code>requires_input</code> <a
   * href="/docs/identity/how-sessions-work">status</a>.</p>
   *
   * <p>Once canceled, future submission attempts are disabled. This cannot be undone. <a
   * href="/docs/identity/verification-sessions#cancel">Learn more</a>.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param session Wire parameter `session`.
   * @param options Execution options.
   */
  public suspend fun postIdentityVerificationSessionsSessionCancelWithResponse(
    request: InlineV1IdentityVerificationSessionsCancelPostRequestFormX96e70eec? = null,
    session: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostIdentityVerificationSessionsSessionCancelResponse> = executor.executeWithResponse<InlineV1IdentityVerificationSessionsCancelPostRequestFormX96e70eec?, PostIdentityVerificationSessionsSessionCancelResponse>(SdkExecutionRequest(postIdentityVerificationSessionsSessionCancelMetadata, baseUri, request, listOf(IdentityCodecs.POSTIDENTITYVERIFICATIONSESSIONSSESSIONCANCEL_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "session", values = listOf(session.toString())))
  }), IdentityCodecs.postIdentityVerificationSessionsSessionCancelRequestCodecRegistry, PostIdentityVerificationSessionsSessionCancelResponseDecoder, options)

  /**
   * <p>Redact a VerificationSession to remove all collected information from Stripe. This will redact
   * the VerificationSession and all objects related to it, including VerificationReports, Events,
   * request logs, etc.</p>
   *
   * <p>A VerificationSession object can be redacted when it is in <code>requires_input</code> or <code>verified</code>
   * <a href="/docs/identity/how-sessions-work">status</a>. Redacting a VerificationSession in
   * <code>requires_action</code>
   * state will automatically cancel it.</p>
   *
   * <p>The redaction process may take up to four days. When the redaction process is in progress, the
   * VerificationSession’s <code>redaction.status</code> field will be set to <code>processing</code>; when the process
   * is
   * finished, it will change to <code>redacted</code> and an <code>identity.verification_session.redacted</code> event
   * will be emitted.</p>
   *
   * <p>Redaction is irreversible. Redacted objects are still accessible in the Stripe API, but all the
   * fields that contain personal data will be replaced by the string <code>[redacted]</code> or a similar
   * placeholder. The <code>metadata</code> field will also be erased. Redacted objects cannot be updated or
   * used for any purpose.</p>
   *
   * <p><a href="/docs/identity/verification-sessions#redact">Learn more</a>.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param session Wire parameter `session`.
   * @param options Execution options.
   */
  public suspend fun postIdentityVerificationSessionsSessionRedactWithResponse(
    request: InlineV1IdentityVerificationSessionsRedactPostRequestFormX31077106? = null,
    session: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostIdentityVerificationSessionsSessionRedactResponse> = executor.executeWithResponse<InlineV1IdentityVerificationSessionsRedactPostRequestFormX31077106?, PostIdentityVerificationSessionsSessionRedactResponse>(SdkExecutionRequest(postIdentityVerificationSessionsSessionRedactMetadata, baseUri, request, listOf(IdentityCodecs.POSTIDENTITYVERIFICATIONSESSIONSSESSIONREDACT_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "session", values = listOf(session.toString())))
  }), IdentityCodecs.postIdentityVerificationSessionsSessionRedactRequestCodecRegistry, PostIdentityVerificationSessionsSessionRedactResponseDecoder, options)

  /**
   * Typed response alternatives for `GetIdentityVerificationReports`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface GetIdentityVerificationReportsResponse {
    public class SuccessJson(
      public val json: InlineV1IdentityVerificationReportsGetResponse200JsonXae823fe9,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetIdentityVerificationReportsResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetIdentityVerificationReportsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetIdentityVerificationReportsResponse
  }

  private object GetIdentityVerificationReportsResponseDecoder : SdkResponseAlternativeDecoder<GetIdentityVerificationReportsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetIdentityVerificationReportsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetIdentityVerificationReportsResponse> = when {
      alternative.id == "GetIdentityVerificationReports.response.alternative0" -> SdkResponseDecodeResult(
        value = GetIdentityVerificationReportsResponse.SuccessJson(
          json = IdentityCodecs.getIdentityVerificationReportsResponseCodecAlternative0Registry.select(listOf("GetIdentityVerificationReports.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetIdentityVerificationReports.response.alternative1" -> SdkResponseDecodeResult(
        value = GetIdentityVerificationReportsResponse.DefaultJson(
          json = IdentityCodecs.getIdentityVerificationReportsResponseCodecAlternative1Registry.select(listOf("GetIdentityVerificationReports.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetIdentityVerificationReportsResponse = GetIdentityVerificationReportsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetIdentityVerificationReportsReport`. Non-success alternatives are not converted
   * into success values.
   */
  public sealed interface GetIdentityVerificationReportsReportResponse {
    public class SuccessJson(
      public val json: IdentityVerificationReport,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetIdentityVerificationReportsReportResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetIdentityVerificationReportsReportResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetIdentityVerificationReportsReportResponse
  }

  private object GetIdentityVerificationReportsReportResponseDecoder : SdkResponseAlternativeDecoder<GetIdentityVerificationReportsReportResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetIdentityVerificationReportsReportResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetIdentityVerificationReportsReportResponse> = when {
      alternative.id == "GetIdentityVerificationReportsReport.response.alternative0" -> SdkResponseDecodeResult(
        value = GetIdentityVerificationReportsReportResponse.SuccessJson(
          json = IdentityCodecs.getIdentityVerificationReportsReportResponseCodecAlternative0Registry.select(listOf("GetIdentityVerificationReportsReport.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetIdentityVerificationReportsReport.response.alternative1" -> SdkResponseDecodeResult(
        value = GetIdentityVerificationReportsReportResponse.DefaultJson(
          json = IdentityCodecs.getIdentityVerificationReportsReportResponseCodecAlternative1Registry.select(listOf("GetIdentityVerificationReportsReport.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetIdentityVerificationReportsReportResponse = GetIdentityVerificationReportsReportResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetIdentityVerificationSessions`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface GetIdentityVerificationSessionsResponse {
    public class SuccessJson(
      public val json: InlineV1IdentityVerificationSessionsGetResponse200JsonX40a2b175,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetIdentityVerificationSessionsResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetIdentityVerificationSessionsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetIdentityVerificationSessionsResponse
  }

  private object GetIdentityVerificationSessionsResponseDecoder : SdkResponseAlternativeDecoder<GetIdentityVerificationSessionsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetIdentityVerificationSessionsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetIdentityVerificationSessionsResponse> = when {
      alternative.id == "GetIdentityVerificationSessions.response.alternative0" -> SdkResponseDecodeResult(
        value = GetIdentityVerificationSessionsResponse.SuccessJson(
          json = IdentityCodecs.getIdentityVerificationSessionsResponseCodecAlternative0Registry.select(listOf("GetIdentityVerificationSessions.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetIdentityVerificationSessions.response.alternative1" -> SdkResponseDecodeResult(
        value = GetIdentityVerificationSessionsResponse.DefaultJson(
          json = IdentityCodecs.getIdentityVerificationSessionsResponseCodecAlternative1Registry.select(listOf("GetIdentityVerificationSessions.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetIdentityVerificationSessionsResponse = GetIdentityVerificationSessionsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetIdentityVerificationSessionsSession`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface GetIdentityVerificationSessionsSessionResponse {
    public class SuccessJson(
      public val json: IdentityVerificationSession,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetIdentityVerificationSessionsSessionResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetIdentityVerificationSessionsSessionResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetIdentityVerificationSessionsSessionResponse
  }

  private object GetIdentityVerificationSessionsSessionResponseDecoder : SdkResponseAlternativeDecoder<GetIdentityVerificationSessionsSessionResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetIdentityVerificationSessionsSessionResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetIdentityVerificationSessionsSessionResponse> = when {
      alternative.id == "GetIdentityVerificationSessionsSession.response.alternative0" -> SdkResponseDecodeResult(
        value = GetIdentityVerificationSessionsSessionResponse.SuccessJson(
          json = IdentityCodecs.getIdentityVerificationSessionsSessionResponseCodecAlternative0Registry.select(listOf("GetIdentityVerificationSessionsSession.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetIdentityVerificationSessionsSession.response.alternative1" -> SdkResponseDecodeResult(
        value = GetIdentityVerificationSessionsSessionResponse.DefaultJson(
          json = IdentityCodecs.getIdentityVerificationSessionsSessionResponseCodecAlternative1Registry.select(listOf("GetIdentityVerificationSessionsSession.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetIdentityVerificationSessionsSessionResponse = GetIdentityVerificationSessionsSessionResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostIdentityVerificationSessions`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface PostIdentityVerificationSessionsResponse {
    public class SuccessJson(
      public val json: IdentityVerificationSession,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostIdentityVerificationSessionsResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostIdentityVerificationSessionsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostIdentityVerificationSessionsResponse
  }

  private object PostIdentityVerificationSessionsResponseDecoder : SdkResponseAlternativeDecoder<PostIdentityVerificationSessionsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostIdentityVerificationSessionsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostIdentityVerificationSessionsResponse> = when {
      alternative.id == "PostIdentityVerificationSessions.response.alternative0" -> SdkResponseDecodeResult(
        value = PostIdentityVerificationSessionsResponse.SuccessJson(
          json = IdentityCodecs.postIdentityVerificationSessionsResponseCodecAlternative0Registry.select(listOf("PostIdentityVerificationSessions.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostIdentityVerificationSessions.response.alternative1" -> SdkResponseDecodeResult(
        value = PostIdentityVerificationSessionsResponse.DefaultJson(
          json = IdentityCodecs.postIdentityVerificationSessionsResponseCodecAlternative1Registry.select(listOf("PostIdentityVerificationSessions.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostIdentityVerificationSessionsResponse = PostIdentityVerificationSessionsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostIdentityVerificationSessionsSession`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface PostIdentityVerificationSessionsSessionResponse {
    public class SuccessJson(
      public val json: IdentityVerificationSession,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostIdentityVerificationSessionsSessionResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostIdentityVerificationSessionsSessionResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostIdentityVerificationSessionsSessionResponse
  }

  private object PostIdentityVerificationSessionsSessionResponseDecoder : SdkResponseAlternativeDecoder<PostIdentityVerificationSessionsSessionResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostIdentityVerificationSessionsSessionResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostIdentityVerificationSessionsSessionResponse> = when {
      alternative.id == "PostIdentityVerificationSessionsSession.response.alternative0" -> SdkResponseDecodeResult(
        value = PostIdentityVerificationSessionsSessionResponse.SuccessJson(
          json = IdentityCodecs.postIdentityVerificationSessionsSessionResponseCodecAlternative0Registry.select(listOf("PostIdentityVerificationSessionsSession.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostIdentityVerificationSessionsSession.response.alternative1" -> SdkResponseDecodeResult(
        value = PostIdentityVerificationSessionsSessionResponse.DefaultJson(
          json = IdentityCodecs.postIdentityVerificationSessionsSessionResponseCodecAlternative1Registry.select(listOf("PostIdentityVerificationSessionsSession.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostIdentityVerificationSessionsSessionResponse = PostIdentityVerificationSessionsSessionResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostIdentityVerificationSessionsSessionCancel`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface PostIdentityVerificationSessionsSessionCancelResponse {
    public class SuccessJson(
      public val json: IdentityVerificationSession,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostIdentityVerificationSessionsSessionCancelResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostIdentityVerificationSessionsSessionCancelResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostIdentityVerificationSessionsSessionCancelResponse
  }

  private object PostIdentityVerificationSessionsSessionCancelResponseDecoder : SdkResponseAlternativeDecoder<PostIdentityVerificationSessionsSessionCancelResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostIdentityVerificationSessionsSessionCancelResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostIdentityVerificationSessionsSessionCancelResponse> = when {
      alternative.id == "PostIdentityVerificationSessionsSessionCancel.response.alternative0" -> SdkResponseDecodeResult(
        value = PostIdentityVerificationSessionsSessionCancelResponse.SuccessJson(
          json = IdentityCodecs.postIdentityVerificationSessionsSessionCancelResponseCodecAlternative0Registry.select(listOf("PostIdentityVerificationSessionsSessionCancel.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostIdentityVerificationSessionsSessionCancel.response.alternative1" -> SdkResponseDecodeResult(
        value = PostIdentityVerificationSessionsSessionCancelResponse.DefaultJson(
          json = IdentityCodecs.postIdentityVerificationSessionsSessionCancelResponseCodecAlternative1Registry.select(listOf("PostIdentityVerificationSessionsSessionCancel.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostIdentityVerificationSessionsSessionCancelResponse = PostIdentityVerificationSessionsSessionCancelResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostIdentityVerificationSessionsSessionRedact`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface PostIdentityVerificationSessionsSessionRedactResponse {
    public class SuccessJson(
      public val json: IdentityVerificationSession,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostIdentityVerificationSessionsSessionRedactResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostIdentityVerificationSessionsSessionRedactResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostIdentityVerificationSessionsSessionRedactResponse
  }

  private object PostIdentityVerificationSessionsSessionRedactResponseDecoder : SdkResponseAlternativeDecoder<PostIdentityVerificationSessionsSessionRedactResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostIdentityVerificationSessionsSessionRedactResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostIdentityVerificationSessionsSessionRedactResponse> = when {
      alternative.id == "PostIdentityVerificationSessionsSessionRedact.response.alternative0" -> SdkResponseDecodeResult(
        value = PostIdentityVerificationSessionsSessionRedactResponse.SuccessJson(
          json = IdentityCodecs.postIdentityVerificationSessionsSessionRedactResponseCodecAlternative0Registry.select(listOf("PostIdentityVerificationSessionsSessionRedact.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostIdentityVerificationSessionsSessionRedact.response.alternative1" -> SdkResponseDecodeResult(
        value = PostIdentityVerificationSessionsSessionRedactResponse.DefaultJson(
          json = IdentityCodecs.postIdentityVerificationSessionsSessionRedactResponseCodecAlternative1Registry.select(listOf("PostIdentityVerificationSessionsSessionRedact.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostIdentityVerificationSessionsSessionRedactResponse = PostIdentityVerificationSessionsSessionRedactResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    public val getIdentityVerificationReportsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetIdentityVerificationReports",
          method = "GET",
          path = "/v1/identity/verification_reports",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1IdentityVerificationReportsGetResponse200JsonXae823fe9",
              mode = SdkResponseMode.BUFFERED,
              id = "GetIdentityVerificationReports.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetIdentityVerificationReports.response.alternative1",
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

    public val getIdentityVerificationReportsReportMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetIdentityVerificationReportsReport",
          method = "GET",
          path = "/v1/identity/verification_reports/{report}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "IdentityVerificationReport",
              mode = SdkResponseMode.BUFFERED,
              id = "GetIdentityVerificationReportsReport.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetIdentityVerificationReportsReport.response.alternative1",
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

    public val getIdentityVerificationSessionsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetIdentityVerificationSessions",
          method = "GET",
          path = "/v1/identity/verification_sessions",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1IdentityVerificationSessionsGetResponse200JsonX40a2b175",
              mode = SdkResponseMode.BUFFERED,
              id = "GetIdentityVerificationSessions.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetIdentityVerificationSessions.response.alternative1",
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

    public val getIdentityVerificationSessionsSessionMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetIdentityVerificationSessionsSession",
          method = "GET",
          path = "/v1/identity/verification_sessions/{session}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "IdentityVerificationSession",
              mode = SdkResponseMode.BUFFERED,
              id = "GetIdentityVerificationSessionsSession.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetIdentityVerificationSessionsSession.response.alternative1",
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

    public val postIdentityVerificationSessionsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostIdentityVerificationSessions",
          method = "POST",
          path = "/v1/identity/verification_sessions",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "IdentityVerificationSession",
              mode = SdkResponseMode.BUFFERED,
              id = "PostIdentityVerificationSessions.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostIdentityVerificationSessions.response.alternative1",
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

    public val postIdentityVerificationSessionsSessionMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostIdentityVerificationSessionsSession",
          method = "POST",
          path = "/v1/identity/verification_sessions/{session}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "IdentityVerificationSession",
              mode = SdkResponseMode.BUFFERED,
              id = "PostIdentityVerificationSessionsSession.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostIdentityVerificationSessionsSession.response.alternative1",
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

    public val postIdentityVerificationSessionsSessionCancelMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostIdentityVerificationSessionsSessionCancel",
          method = "POST",
          path = "/v1/identity/verification_sessions/{session}/cancel",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "IdentityVerificationSession",
              mode = SdkResponseMode.BUFFERED,
              id = "PostIdentityVerificationSessionsSessionCancel.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostIdentityVerificationSessionsSessionCancel.response.alternative1",
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

    public val postIdentityVerificationSessionsSessionRedactMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostIdentityVerificationSessionsSessionRedact",
          method = "POST",
          path = "/v1/identity/verification_sessions/{session}/redact",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "IdentityVerificationSession",
              mode = SdkResponseMode.BUFFERED,
              id = "PostIdentityVerificationSessionsSessionRedact.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostIdentityVerificationSessionsSessionRedact.response.alternative1",
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
