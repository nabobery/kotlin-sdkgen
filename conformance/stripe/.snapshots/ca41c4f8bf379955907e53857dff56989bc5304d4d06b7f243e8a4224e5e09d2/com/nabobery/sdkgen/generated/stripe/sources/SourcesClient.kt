package com.nabobery.sdkgen.generated.stripe.sources

import com.nabobery.sdkgen.generated.stripe.Error
import com.nabobery.sdkgen.generated.stripe.InlineV1SourcesPostRequestFormX1a757f24
import com.nabobery.sdkgen.generated.stripe.InlineV1SourcesPostRequestFormXcf12bebf
import com.nabobery.sdkgen.generated.stripe.InlineV1SourcesSourceTransactionsGetResponse200JsonXf59dbfd7
import com.nabobery.sdkgen.generated.stripe.InlineV1SourcesVerifyPostRequestFormX1f834e47
import com.nabobery.sdkgen.generated.stripe.SdkJson
import com.nabobery.sdkgen.generated.stripe.Source
import com.nabobery.sdkgen.generated.stripe.SourceMandateNotification
import com.nabobery.sdkgen.generated.stripe.SourceTransaction
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

internal object SourcesCodecs {
  internal const val GETSOURCESSOURCE_REQUEST_CODEC_ID: String = "GetSourcesSource.request"

  private val getSourcesSourceRequestCodec: MediaTypeCodec<JsonObject?> = GetSourcesSourceFormCodec

  private val getSourcesSourceResponseCodecAlternative0Codec: MediaTypeCodec<Source> =
      KotlinxSerializationCodec("GetSourcesSource.response.alternative0", Source.Serializer, SdkJson)

  internal val getSourcesSourceResponseCodecAlternative0Registry: MediaTypeCodecRegistry<Source> =
      MediaTypeCodecRegistry.of(getSourcesSourceResponseCodecAlternative0Codec)

  private val getSourcesSourceResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetSourcesSource.response.alternative1", Error.Serializer, SdkJson)

  internal val getSourcesSourceResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getSourcesSourceResponseCodecAlternative1Codec)

  internal val getSourcesSourceRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getSourcesSourceRequestCodec)

  internal const val GETSOURCESSOURCEMANDATENOTIFICATIONSMANDATENOTIFICATION_REQUEST_CODEC_ID:
      String = "GetSourcesSourceMandateNotificationsMandateNotification.request"

  private val getSourcesSourceMandateNotificationsMandateNotificationRequestCodec:
      MediaTypeCodec<JsonObject?> = GetSourcesSourceMandateNotificationsMandateNotificationFormCodec

  private val getSourcesSourceMandateNotificationsMandateNotificationResponseCodecAlternative0Codec:
      MediaTypeCodec<SourceMandateNotification> =
      KotlinxSerializationCodec("GetSourcesSourceMandateNotificationsMandateNotification.response.alternative0", SourceMandateNotification.Serializer, SdkJson)

  internal val getSourcesSourceMandateNotificationsMandateNotificationResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<SourceMandateNotification> =
      MediaTypeCodecRegistry.of(getSourcesSourceMandateNotificationsMandateNotificationResponseCodecAlternative0Codec)

  private val getSourcesSourceMandateNotificationsMandateNotificationResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetSourcesSourceMandateNotificationsMandateNotification.response.alternative1", Error.Serializer, SdkJson)

  internal val getSourcesSourceMandateNotificationsMandateNotificationResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getSourcesSourceMandateNotificationsMandateNotificationResponseCodecAlternative1Codec)

  internal val getSourcesSourceMandateNotificationsMandateNotificationRequestCodecRegistry:
      MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getSourcesSourceMandateNotificationsMandateNotificationRequestCodec)

  internal const val GETSOURCESSOURCESOURCETRANSACTIONS_REQUEST_CODEC_ID: String =
      "GetSourcesSourceSourceTransactions.request"

  private val getSourcesSourceSourceTransactionsRequestCodec: MediaTypeCodec<JsonObject?> =
      GetSourcesSourceSourceTransactionsFormCodec

  private val getSourcesSourceSourceTransactionsResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1SourcesSourceTransactionsGetResponse200JsonXf59dbfd7> =
      KotlinxSerializationCodec("GetSourcesSourceSourceTransactions.response.alternative0", InlineV1SourcesSourceTransactionsGetResponse200JsonXf59dbfd7.Serializer, SdkJson)

  internal val getSourcesSourceSourceTransactionsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1SourcesSourceTransactionsGetResponse200JsonXf59dbfd7> =
      MediaTypeCodecRegistry.of(getSourcesSourceSourceTransactionsResponseCodecAlternative0Codec)

  private val getSourcesSourceSourceTransactionsResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetSourcesSourceSourceTransactions.response.alternative1", Error.Serializer, SdkJson)

  internal val getSourcesSourceSourceTransactionsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getSourcesSourceSourceTransactionsResponseCodecAlternative1Codec)

  internal val getSourcesSourceSourceTransactionsRequestCodecRegistry:
      MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getSourcesSourceSourceTransactionsRequestCodec)

  internal const val GETSOURCESSOURCESOURCETRANSACTIONSSOURCETRANSACTION_REQUEST_CODEC_ID: String =
      "GetSourcesSourceSourceTransactionsSourceTransaction.request"

  private val getSourcesSourceSourceTransactionsSourceTransactionRequestCodec:
      MediaTypeCodec<JsonObject?> = GetSourcesSourceSourceTransactionsSourceTransactionFormCodec

  private val getSourcesSourceSourceTransactionsSourceTransactionResponseCodecAlternative0Codec:
      MediaTypeCodec<SourceTransaction> =
      KotlinxSerializationCodec("GetSourcesSourceSourceTransactionsSourceTransaction.response.alternative0", SourceTransaction.Serializer, SdkJson)

  internal val getSourcesSourceSourceTransactionsSourceTransactionResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<SourceTransaction> =
      MediaTypeCodecRegistry.of(getSourcesSourceSourceTransactionsSourceTransactionResponseCodecAlternative0Codec)

  private val getSourcesSourceSourceTransactionsSourceTransactionResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetSourcesSourceSourceTransactionsSourceTransaction.response.alternative1", Error.Serializer, SdkJson)

  internal val getSourcesSourceSourceTransactionsSourceTransactionResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getSourcesSourceSourceTransactionsSourceTransactionResponseCodecAlternative1Codec)

  internal val getSourcesSourceSourceTransactionsSourceTransactionRequestCodecRegistry:
      MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getSourcesSourceSourceTransactionsSourceTransactionRequestCodec)

  internal const val POSTSOURCES_REQUEST_CODEC_ID: String = "PostSources.request"

  private val postSourcesRequestCodec: MediaTypeCodec<InlineV1SourcesPostRequestFormX1a757f24?> =
      PostSourcesFormCodec

  private val postSourcesResponseCodecAlternative0Codec: MediaTypeCodec<Source> =
      KotlinxSerializationCodec("PostSources.response.alternative0", Source.Serializer, SdkJson)

  internal val postSourcesResponseCodecAlternative0Registry: MediaTypeCodecRegistry<Source> =
      MediaTypeCodecRegistry.of(postSourcesResponseCodecAlternative0Codec)

  private val postSourcesResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostSources.response.alternative1", Error.Serializer, SdkJson)

  internal val postSourcesResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postSourcesResponseCodecAlternative1Codec)

  internal val postSourcesRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1SourcesPostRequestFormX1a757f24?> =
      MediaTypeCodecRegistry.of(postSourcesRequestCodec)

  internal const val POSTSOURCESSOURCE_REQUEST_CODEC_ID: String = "PostSourcesSource.request"

  private val postSourcesSourceRequestCodec:
      MediaTypeCodec<InlineV1SourcesPostRequestFormXcf12bebf?> = PostSourcesSourceFormCodec

  private val postSourcesSourceResponseCodecAlternative0Codec: MediaTypeCodec<Source> =
      KotlinxSerializationCodec("PostSourcesSource.response.alternative0", Source.Serializer, SdkJson)

  internal val postSourcesSourceResponseCodecAlternative0Registry: MediaTypeCodecRegistry<Source> =
      MediaTypeCodecRegistry.of(postSourcesSourceResponseCodecAlternative0Codec)

  private val postSourcesSourceResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostSourcesSource.response.alternative1", Error.Serializer, SdkJson)

  internal val postSourcesSourceResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postSourcesSourceResponseCodecAlternative1Codec)

  internal val postSourcesSourceRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1SourcesPostRequestFormXcf12bebf?> =
      MediaTypeCodecRegistry.of(postSourcesSourceRequestCodec)

  internal const val POSTSOURCESSOURCEVERIFY_REQUEST_CODEC_ID: String =
      "PostSourcesSourceVerify.request"

  private val postSourcesSourceVerifyRequestCodec:
      MediaTypeCodec<InlineV1SourcesVerifyPostRequestFormX1f834e47> =
      PostSourcesSourceVerifyFormCodec

  private val postSourcesSourceVerifyResponseCodecAlternative0Codec: MediaTypeCodec<Source> =
      KotlinxSerializationCodec("PostSourcesSourceVerify.response.alternative0", Source.Serializer, SdkJson)

  internal val postSourcesSourceVerifyResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<Source> =
      MediaTypeCodecRegistry.of(postSourcesSourceVerifyResponseCodecAlternative0Codec)

  private val postSourcesSourceVerifyResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostSourcesSourceVerify.response.alternative1", Error.Serializer, SdkJson)

  internal val postSourcesSourceVerifyResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postSourcesSourceVerifyResponseCodecAlternative1Codec)

  internal val postSourcesSourceVerifyRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1SourcesVerifyPostRequestFormX1f834e47> =
      MediaTypeCodecRegistry.of(postSourcesSourceVerifyRequestCodec)

  internal object GetSourcesSourceFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetSourcesSource.request"

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

  internal object GetSourcesSourceMandateNotificationsMandateNotificationFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetSourcesSourceMandateNotificationsMandateNotification.request"

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

  internal object GetSourcesSourceSourceTransactionsFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetSourcesSourceSourceTransactions.request"

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

  internal object GetSourcesSourceSourceTransactionsSourceTransactionFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetSourcesSourceSourceTransactionsSourceTransaction.request"

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

  internal object PostSourcesFormCodec : MediaTypeCodec<InlineV1SourcesPostRequestFormX1a757f24?> {
    override val id: String = "PostSources.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1SourcesPostRequestFormX1a757f24?, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      request.amount?.let { formValue0 ->
        form.add("amount", formValue0.toString())
      }
      request.currency?.let { formValue0 ->
        form.add("currency", formValue0)
      }
      request.customer?.let { formValue0 ->
        form.add("customer", formValue0)
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
      request.flow?.let { formValue0 ->
        form.add("flow", formValue0.value)
      }
      request.mandate?.let { formValue0 ->
        formValue0.acceptance?.let { formValue2 ->
          formValue2.date?.let { formValue4 ->
            form.add("mandate" + "[acceptance]" + "[date]", formValue4.toString())
          }
          formValue2.ip?.let { formValue4 ->
            form.add("mandate" + "[acceptance]" + "[ip]", formValue4)
          }
          formValue2.offline?.let { formValue4 ->
            form.add("mandate" + "[acceptance]" + "[offline]" + "[contact_email]", formValue4.contactEmail)
          }
          formValue2.online?.let { formValue4 ->
            formValue4.date?.let { formValue6 ->
              form.add("mandate" + "[acceptance]" + "[online]" + "[date]", formValue6.toString())
            }
            formValue4.ip?.let { formValue6 ->
              form.add("mandate" + "[acceptance]" + "[online]" + "[ip]", formValue6)
            }
            formValue4.userAgent?.let { formValue6 ->
              form.add("mandate" + "[acceptance]" + "[online]" + "[user_agent]", formValue6)
            }
          }
          form.add("mandate" + "[acceptance]" + "[status]", formValue2.status.value)
          formValue2.type?.let { formValue4 ->
            form.add("mandate" + "[acceptance]" + "[type]", formValue4.value)
          }
          formValue2.userAgent?.let { formValue4 ->
            form.add("mandate" + "[acceptance]" + "[user_agent]", formValue4)
          }
        }
        formValue0.amount?.let { formValue2 ->
          require(formValue2.matchedBranches.size == 1) { "Form union value must match exactly one wire-kind branch" }
          when {
            formValue2.branch1 != null -> {
              form.add("mandate" + "[amount]", requireNotNull(formValue2.branch1).toString())
            }
            formValue2.inlineV1SourcesPostRequestFormMandateAmountAnyOf2X03b01257 != null -> {
              form.add("mandate" + "[amount]", requireNotNull(formValue2.inlineV1SourcesPostRequestFormMandateAmountAnyOf2X03b01257).value)
            }
            else -> {
              error("Form union value has no selected branch")
            }
          }
        }
        formValue0.currency?.let { formValue2 ->
          form.add("mandate" + "[currency]", formValue2)
        }
        formValue0.interval?.let { formValue2 ->
          form.add("mandate" + "[interval]", formValue2.value)
        }
        formValue0.notificationMethod?.let { formValue2 ->
          form.add("mandate" + "[notification_method]", formValue2.value)
        }
      }
      request.metadata?.let { formValue0 ->
        formValue0.forEach { (formKey1, formMapValue1) ->
          form.add("metadata" + "[" + formKey1 + "]", formMapValue1)
        }
      }
      request.originalSource?.let { formValue0 ->
        form.add("original_source", formValue0)
      }
      request.owner?.let { formValue0 ->
        formValue0.address?.let { formValue2 ->
          formValue2.city?.let { formValue4 ->
            form.add("owner" + "[address]" + "[city]", formValue4)
          }
          formValue2.country?.let { formValue4 ->
            form.add("owner" + "[address]" + "[country]", formValue4)
          }
          formValue2.line1?.let { formValue4 ->
            form.add("owner" + "[address]" + "[line1]", formValue4)
          }
          formValue2.line2?.let { formValue4 ->
            form.add("owner" + "[address]" + "[line2]", formValue4)
          }
          formValue2.postalCode?.let { formValue4 ->
            form.add("owner" + "[address]" + "[postal_code]", formValue4)
          }
          formValue2.state?.let { formValue4 ->
            form.add("owner" + "[address]" + "[state]", formValue4)
          }
        }
        formValue0.email?.let { formValue2 ->
          form.add("owner" + "[email]", formValue2)
        }
        formValue0.name?.let { formValue2 ->
          form.add("owner" + "[name]", formValue2)
        }
        formValue0.phone?.let { formValue2 ->
          form.add("owner" + "[phone]", formValue2)
        }
      }
      request.receiver?.let { formValue0 ->
        formValue0.refundAttributesMethod?.let { formValue2 ->
          form.add("receiver" + "[refund_attributes_method]", formValue2.value)
        }
      }
      request.redirect?.let { formValue0 ->
        form.add("redirect" + "[return_url]", formValue0.returnUrl)
      }
      request.sourceOrder?.let { formValue0 ->
        formValue0.items?.let { formValue2 ->
          if (formValue2.isEmpty()) {
            form.add("source_order" + "[items]", "")
          } else {
            formValue2.forEachIndexed { formIndex3, formElement3 ->
              formElement3.amount?.let { formValue5 ->
                form.add("source_order" + "[items]" + "[" + formIndex3 + "]" + "[amount]", formValue5.toString())
              }
              formElement3.currency?.let { formValue5 ->
                form.add("source_order" + "[items]" + "[" + formIndex3 + "]" + "[currency]", formValue5)
              }
              formElement3.description?.let { formValue5 ->
                form.add("source_order" + "[items]" + "[" + formIndex3 + "]" + "[description]", formValue5)
              }
              formElement3.parent?.let { formValue5 ->
                form.add("source_order" + "[items]" + "[" + formIndex3 + "]" + "[parent]", formValue5)
              }
              formElement3.quantity?.let { formValue5 ->
                form.add("source_order" + "[items]" + "[" + formIndex3 + "]" + "[quantity]", formValue5.toString())
              }
              formElement3.type?.let { formValue5 ->
                form.add("source_order" + "[items]" + "[" + formIndex3 + "]" + "[type]", formValue5.value)
              }
            }
          }
        }
        formValue0.shipping?.let { formValue2 ->
          formValue2.address.city?.let { formValue5 ->
            form.add("source_order" + "[shipping]" + "[address]" + "[city]", formValue5)
          }
          formValue2.address.country?.let { formValue5 ->
            form.add("source_order" + "[shipping]" + "[address]" + "[country]", formValue5)
          }
          form.add("source_order" + "[shipping]" + "[address]" + "[line1]", formValue2.address.line1)
          formValue2.address.line2?.let { formValue5 ->
            form.add("source_order" + "[shipping]" + "[address]" + "[line2]", formValue5)
          }
          formValue2.address.postalCode?.let { formValue5 ->
            form.add("source_order" + "[shipping]" + "[address]" + "[postal_code]", formValue5)
          }
          formValue2.address.state?.let { formValue5 ->
            form.add("source_order" + "[shipping]" + "[address]" + "[state]", formValue5)
          }
          formValue2.carrier?.let { formValue4 ->
            form.add("source_order" + "[shipping]" + "[carrier]", formValue4)
          }
          formValue2.name?.let { formValue4 ->
            form.add("source_order" + "[shipping]" + "[name]", formValue4)
          }
          formValue2.phone?.let { formValue4 ->
            form.add("source_order" + "[shipping]" + "[phone]", formValue4)
          }
          formValue2.trackingNumber?.let { formValue4 ->
            form.add("source_order" + "[shipping]" + "[tracking_number]", formValue4)
          }
        }
      }
      request.statementDescriptor?.let { formValue0 ->
        form.add("statement_descriptor", formValue0)
      }
      request.token?.let { formValue0 ->
        form.add("token", formValue0)
      }
      request.type?.let { formValue0 ->
        form.add("type", formValue0)
      }
      request.usage?.let { formValue0 ->
        form.add("usage", formValue0.value)
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1SourcesPostRequestFormX1a757f24? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  internal object PostSourcesSourceFormCodec : MediaTypeCodec<InlineV1SourcesPostRequestFormXcf12bebf?> {
    override val id: String = "PostSourcesSource.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1SourcesPostRequestFormXcf12bebf?, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      request.amount?.let { formValue0 ->
        form.add("amount", formValue0.toString())
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
      request.mandate?.let { formValue0 ->
        formValue0.acceptance?.let { formValue2 ->
          formValue2.date?.let { formValue4 ->
            form.add("mandate" + "[acceptance]" + "[date]", formValue4.toString())
          }
          formValue2.ip?.let { formValue4 ->
            form.add("mandate" + "[acceptance]" + "[ip]", formValue4)
          }
          formValue2.offline?.let { formValue4 ->
            form.add("mandate" + "[acceptance]" + "[offline]" + "[contact_email]", formValue4.contactEmail)
          }
          formValue2.online?.let { formValue4 ->
            formValue4.date?.let { formValue6 ->
              form.add("mandate" + "[acceptance]" + "[online]" + "[date]", formValue6.toString())
            }
            formValue4.ip?.let { formValue6 ->
              form.add("mandate" + "[acceptance]" + "[online]" + "[ip]", formValue6)
            }
            formValue4.userAgent?.let { formValue6 ->
              form.add("mandate" + "[acceptance]" + "[online]" + "[user_agent]", formValue6)
            }
          }
          form.add("mandate" + "[acceptance]" + "[status]", formValue2.status.value)
          formValue2.type?.let { formValue4 ->
            form.add("mandate" + "[acceptance]" + "[type]", formValue4.value)
          }
          formValue2.userAgent?.let { formValue4 ->
            form.add("mandate" + "[acceptance]" + "[user_agent]", formValue4)
          }
        }
        formValue0.amount?.let { formValue2 ->
          require(formValue2.matchedBranches.size == 1) { "Form union value must match exactly one wire-kind branch" }
          when {
            formValue2.branch1 != null -> {
              form.add("mandate" + "[amount]", requireNotNull(formValue2.branch1).toString())
            }
            formValue2.inlineV1SourcesPostRequestFormMandateAmountAnyOf2X0024ea84 != null -> {
              form.add("mandate" + "[amount]", requireNotNull(formValue2.inlineV1SourcesPostRequestFormMandateAmountAnyOf2X0024ea84).value)
            }
            else -> {
              error("Form union value has no selected branch")
            }
          }
        }
        formValue0.currency?.let { formValue2 ->
          form.add("mandate" + "[currency]", formValue2)
        }
        formValue0.interval?.let { formValue2 ->
          form.add("mandate" + "[interval]", formValue2.value)
        }
        formValue0.notificationMethod?.let { formValue2 ->
          form.add("mandate" + "[notification_method]", formValue2.value)
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
          formValue0.inlineV1SourcesPostRequestFormMetadataAnyOf2X7f5863e9 != null -> {
            form.add("metadata", requireNotNull(formValue0.inlineV1SourcesPostRequestFormMetadataAnyOf2X7f5863e9).value)
          }
          else -> {
            error("Form union value has no selected branch")
          }
        }
      }
      request.owner?.let { formValue0 ->
        formValue0.address?.let { formValue2 ->
          formValue2.city?.let { formValue4 ->
            form.add("owner" + "[address]" + "[city]", formValue4)
          }
          formValue2.country?.let { formValue4 ->
            form.add("owner" + "[address]" + "[country]", formValue4)
          }
          formValue2.line1?.let { formValue4 ->
            form.add("owner" + "[address]" + "[line1]", formValue4)
          }
          formValue2.line2?.let { formValue4 ->
            form.add("owner" + "[address]" + "[line2]", formValue4)
          }
          formValue2.postalCode?.let { formValue4 ->
            form.add("owner" + "[address]" + "[postal_code]", formValue4)
          }
          formValue2.state?.let { formValue4 ->
            form.add("owner" + "[address]" + "[state]", formValue4)
          }
        }
        formValue0.email?.let { formValue2 ->
          form.add("owner" + "[email]", formValue2)
        }
        formValue0.name?.let { formValue2 ->
          form.add("owner" + "[name]", formValue2)
        }
        formValue0.phone?.let { formValue2 ->
          form.add("owner" + "[phone]", formValue2)
        }
      }
      request.sourceOrder?.let { formValue0 ->
        formValue0.items?.let { formValue2 ->
          if (formValue2.isEmpty()) {
            form.add("source_order" + "[items]", "")
          } else {
            formValue2.forEachIndexed { formIndex3, formElement3 ->
              formElement3.amount?.let { formValue5 ->
                form.add("source_order" + "[items]" + "[" + formIndex3 + "]" + "[amount]", formValue5.toString())
              }
              formElement3.currency?.let { formValue5 ->
                form.add("source_order" + "[items]" + "[" + formIndex3 + "]" + "[currency]", formValue5)
              }
              formElement3.description?.let { formValue5 ->
                form.add("source_order" + "[items]" + "[" + formIndex3 + "]" + "[description]", formValue5)
              }
              formElement3.parent?.let { formValue5 ->
                form.add("source_order" + "[items]" + "[" + formIndex3 + "]" + "[parent]", formValue5)
              }
              formElement3.quantity?.let { formValue5 ->
                form.add("source_order" + "[items]" + "[" + formIndex3 + "]" + "[quantity]", formValue5.toString())
              }
              formElement3.type?.let { formValue5 ->
                form.add("source_order" + "[items]" + "[" + formIndex3 + "]" + "[type]", formValue5.value)
              }
            }
          }
        }
        formValue0.shipping?.let { formValue2 ->
          formValue2.address.city?.let { formValue5 ->
            form.add("source_order" + "[shipping]" + "[address]" + "[city]", formValue5)
          }
          formValue2.address.country?.let { formValue5 ->
            form.add("source_order" + "[shipping]" + "[address]" + "[country]", formValue5)
          }
          form.add("source_order" + "[shipping]" + "[address]" + "[line1]", formValue2.address.line1)
          formValue2.address.line2?.let { formValue5 ->
            form.add("source_order" + "[shipping]" + "[address]" + "[line2]", formValue5)
          }
          formValue2.address.postalCode?.let { formValue5 ->
            form.add("source_order" + "[shipping]" + "[address]" + "[postal_code]", formValue5)
          }
          formValue2.address.state?.let { formValue5 ->
            form.add("source_order" + "[shipping]" + "[address]" + "[state]", formValue5)
          }
          formValue2.carrier?.let { formValue4 ->
            form.add("source_order" + "[shipping]" + "[carrier]", formValue4)
          }
          formValue2.name?.let { formValue4 ->
            form.add("source_order" + "[shipping]" + "[name]", formValue4)
          }
          formValue2.phone?.let { formValue4 ->
            form.add("source_order" + "[shipping]" + "[phone]", formValue4)
          }
          formValue2.trackingNumber?.let { formValue4 ->
            form.add("source_order" + "[shipping]" + "[tracking_number]", formValue4)
          }
        }
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1SourcesPostRequestFormXcf12bebf? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  internal object PostSourcesSourceVerifyFormCodec : MediaTypeCodec<InlineV1SourcesVerifyPostRequestFormX1f834e47> {
    override val id: String = "PostSourcesSourceVerify.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1SourcesVerifyPostRequestFormX1f834e47, mediaType: String): SdkRequestBody {
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
      if (request.values.isEmpty()) {
        form.add("values", "")
      } else {
        request.values.forEachIndexed { formIndex0, formElement0 ->
          form.add("values" + "[" + formIndex0 + "]", formElement0)
        }
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1SourcesVerifyPostRequestFormX1f834e47 {
      error("Form request codecs do not decode response bodies.")
    }
  }
}

/**
 * Client for the 'sources' group of Stripe API.
 */
public class SourcesClient(
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
      SdkExecutor(transport, authentication = this@SourcesClient.authentication)

  /**
   * <p>Retrieves an existing source object. Supply the unique source ID from a source creation request and Stripe will
   * return the corresponding up-to-date source object information.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param source Wire parameter `source`.
   * @param clientSecret The client secret of the source. Required if a publishable key is used to retrieve the source.
   * @param expand Specifies which fields in the response should be expanded.
   * @param options Execution options.
   */
  public suspend fun getSourcesSourceWithResponse(
    request: JsonObject? = null,
    source: String,
    clientSecret: String? = null,
    expand: List<String>? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetSourcesSourceResponse> = executor.executeWithResponse<JsonObject?, GetSourcesSourceResponse>(SdkExecutionRequest(getSourcesSourceMetadata, baseUri, request, listOf(SourcesCodecs.GETSOURCESSOURCE_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "source", values = listOf(source.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "client_secret", values = clientSecret?.let { listOf(it.toString()) }.orEmpty()))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
  }), SourcesCodecs.getSourcesSourceRequestCodecRegistry, GetSourcesSourceResponseDecoder, options)

  /**
   * <p>Retrieves a new Source MandateNotification.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param mandateNotification Wire parameter `mandate_notification`.
   * @param source Wire parameter `source`.
   * @param expand Specifies which fields in the response should be expanded.
   * @param options Execution options.
   */
  public suspend fun getSourcesSourceMandateNotificationsMandateNotificationWithResponse(
    request: JsonObject? = null,
    mandateNotification: String,
    source: String,
    expand: List<String>? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetSourcesSourceMandateNotificationsMandateNotificationResponse> = executor.executeWithResponse<JsonObject?, GetSourcesSourceMandateNotificationsMandateNotificationResponse>(SdkExecutionRequest(getSourcesSourceMandateNotificationsMandateNotificationMetadata, baseUri, request, listOf(SourcesCodecs.GETSOURCESSOURCEMANDATENOTIFICATIONSMANDATENOTIFICATION_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "mandate_notification", values = listOf(mandateNotification.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "source", values = listOf(source.toString())))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
  }), SourcesCodecs.getSourcesSourceMandateNotificationsMandateNotificationRequestCodecRegistry, GetSourcesSourceMandateNotificationsMandateNotificationResponseDecoder, options)

  /**
   * <p>List source transactions for a given source.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param source Wire parameter `source`.
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
  public suspend fun getSourcesSourceSourceTransactionsWithResponse(
    request: JsonObject? = null,
    source: String,
    endingBefore: String? = null,
    expand: List<String>? = null,
    limit: Int? = null,
    startingAfter: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetSourcesSourceSourceTransactionsResponse> = executor.executeWithResponse<JsonObject?, GetSourcesSourceSourceTransactionsResponse>(SdkExecutionRequest(getSourcesSourceSourceTransactionsMetadata, baseUri, request, listOf(SourcesCodecs.GETSOURCESSOURCESOURCETRANSACTIONS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "source", values = listOf(source.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "ending_before", values = endingBefore?.let { listOf(it.toString()) }.orEmpty()))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "starting_after", values = startingAfter?.let { listOf(it.toString()) }.orEmpty()))
  }), SourcesCodecs.getSourcesSourceSourceTransactionsRequestCodecRegistry, GetSourcesSourceSourceTransactionsResponseDecoder, options)

  /**
   * <p>Retrieve an existing source transaction object. Supply the unique source ID from a source creation request and
   * the source transaction ID and Stripe will return the corresponding up-to-date source object information.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param source Wire parameter `source`.
   * @param sourceTransaction Wire parameter `source_transaction`.
   * @param expand Specifies which fields in the response should be expanded.
   * @param options Execution options.
   */
  public suspend fun getSourcesSourceSourceTransactionsSourceTransactionWithResponse(
    request: JsonObject? = null,
    source: String,
    sourceTransaction: String,
    expand: List<String>? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetSourcesSourceSourceTransactionsSourceTransactionResponse> = executor.executeWithResponse<JsonObject?, GetSourcesSourceSourceTransactionsSourceTransactionResponse>(SdkExecutionRequest(getSourcesSourceSourceTransactionsSourceTransactionMetadata, baseUri, request, listOf(SourcesCodecs.GETSOURCESSOURCESOURCETRANSACTIONSSOURCETRANSACTION_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "source", values = listOf(source.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "source_transaction", values = listOf(sourceTransaction.toString())))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
  }), SourcesCodecs.getSourcesSourceSourceTransactionsSourceTransactionRequestCodecRegistry, GetSourcesSourceSourceTransactionsSourceTransactionResponseDecoder, options)

  /**
   * <p>Creates a new source object.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param options Execution options.
   */
  public suspend fun postSourcesWithResponse(request: InlineV1SourcesPostRequestFormX1a757f24? = null, options: CallOptions = CallOptions()): SdkResponseResult<PostSourcesResponse> = executor.executeWithResponse<InlineV1SourcesPostRequestFormX1a757f24?, PostSourcesResponse>(SdkExecutionRequest(postSourcesMetadata, baseUri, request, listOf(SourcesCodecs.POSTSOURCES_REQUEST_CODEC_ID), emptyList()), SourcesCodecs.postSourcesRequestCodecRegistry, PostSourcesResponseDecoder, options)

  /**
   * <p>Updates the specified source by setting the values of the parameters passed. Any parameters not provided will be
   * left unchanged.</p>
   *
   * <p>This request accepts the <code>metadata</code> and <code>owner</code> as arguments. It is also possible to
   * update type specific information for selected payment methods. Please refer to our <a href="/docs/sources">payment
   * method guides</a> for more detail.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param source Wire parameter `source`.
   * @param options Execution options.
   */
  public suspend fun postSourcesSourceWithResponse(
    request: InlineV1SourcesPostRequestFormXcf12bebf? = null,
    source: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostSourcesSourceResponse> = executor.executeWithResponse<InlineV1SourcesPostRequestFormXcf12bebf?, PostSourcesSourceResponse>(SdkExecutionRequest(postSourcesSourceMetadata, baseUri, request, listOf(SourcesCodecs.POSTSOURCESSOURCE_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "source", values = listOf(source.toString())))
  }), SourcesCodecs.postSourcesSourceRequestCodecRegistry, PostSourcesSourceResponseDecoder, options)

  /**
   * <p>Verify a given source.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param source Wire parameter `source`.
   * @param options Execution options.
   */
  public suspend fun postSourcesSourceVerifyWithResponse(
    request: InlineV1SourcesVerifyPostRequestFormX1f834e47,
    source: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostSourcesSourceVerifyResponse> = executor.executeWithResponse<InlineV1SourcesVerifyPostRequestFormX1f834e47, PostSourcesSourceVerifyResponse>(SdkExecutionRequest(postSourcesSourceVerifyMetadata, baseUri, request, listOf(SourcesCodecs.POSTSOURCESSOURCEVERIFY_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "source", values = listOf(source.toString())))
  }), SourcesCodecs.postSourcesSourceVerifyRequestCodecRegistry, PostSourcesSourceVerifyResponseDecoder, options)

  /**
   * Typed response alternatives for `GetSourcesSource`. Non-success alternatives are not converted into success values.
   */
  public sealed interface GetSourcesSourceResponse {
    public class SuccessJson(
      public val json: Source,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetSourcesSourceResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetSourcesSourceResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetSourcesSourceResponse
  }

  private object GetSourcesSourceResponseDecoder : SdkResponseAlternativeDecoder<GetSourcesSourceResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetSourcesSourceResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetSourcesSourceResponse> = when {
      alternative.id == "GetSourcesSource.response.alternative0" -> SdkResponseDecodeResult(
        value = GetSourcesSourceResponse.SuccessJson(
          json = SourcesCodecs.getSourcesSourceResponseCodecAlternative0Registry.select(listOf("GetSourcesSource.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetSourcesSource.response.alternative1" -> SdkResponseDecodeResult(
        value = GetSourcesSourceResponse.DefaultJson(
          json = SourcesCodecs.getSourcesSourceResponseCodecAlternative1Registry.select(listOf("GetSourcesSource.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetSourcesSourceResponse = GetSourcesSourceResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetSourcesSourceMandateNotificationsMandateNotification`. Non-success alternatives
   * are not converted into success values.
   */
  public sealed interface GetSourcesSourceMandateNotificationsMandateNotificationResponse {
    public class SuccessJson(
      public val json: SourceMandateNotification,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetSourcesSourceMandateNotificationsMandateNotificationResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetSourcesSourceMandateNotificationsMandateNotificationResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetSourcesSourceMandateNotificationsMandateNotificationResponse
  }

  private object GetSourcesSourceMandateNotificationsMandateNotificationResponseDecoder : SdkResponseAlternativeDecoder<GetSourcesSourceMandateNotificationsMandateNotificationResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetSourcesSourceMandateNotificationsMandateNotificationResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetSourcesSourceMandateNotificationsMandateNotificationResponse> = when {
      alternative.id == "GetSourcesSourceMandateNotificationsMandateNotification.response.alternative0" -> SdkResponseDecodeResult(
        value = GetSourcesSourceMandateNotificationsMandateNotificationResponse.SuccessJson(
          json = SourcesCodecs.getSourcesSourceMandateNotificationsMandateNotificationResponseCodecAlternative0Registry.select(listOf("GetSourcesSourceMandateNotificationsMandateNotification.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetSourcesSourceMandateNotificationsMandateNotification.response.alternative1" -> SdkResponseDecodeResult(
        value = GetSourcesSourceMandateNotificationsMandateNotificationResponse.DefaultJson(
          json = SourcesCodecs.getSourcesSourceMandateNotificationsMandateNotificationResponseCodecAlternative1Registry.select(listOf("GetSourcesSourceMandateNotificationsMandateNotification.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetSourcesSourceMandateNotificationsMandateNotificationResponse = GetSourcesSourceMandateNotificationsMandateNotificationResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetSourcesSourceSourceTransactions`. Non-success alternatives are not converted
   * into success values.
   */
  public sealed interface GetSourcesSourceSourceTransactionsResponse {
    public class SuccessJson(
      public val json: InlineV1SourcesSourceTransactionsGetResponse200JsonXf59dbfd7,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetSourcesSourceSourceTransactionsResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetSourcesSourceSourceTransactionsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetSourcesSourceSourceTransactionsResponse
  }

  private object GetSourcesSourceSourceTransactionsResponseDecoder : SdkResponseAlternativeDecoder<GetSourcesSourceSourceTransactionsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetSourcesSourceSourceTransactionsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetSourcesSourceSourceTransactionsResponse> = when {
      alternative.id == "GetSourcesSourceSourceTransactions.response.alternative0" -> SdkResponseDecodeResult(
        value = GetSourcesSourceSourceTransactionsResponse.SuccessJson(
          json = SourcesCodecs.getSourcesSourceSourceTransactionsResponseCodecAlternative0Registry.select(listOf("GetSourcesSourceSourceTransactions.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetSourcesSourceSourceTransactions.response.alternative1" -> SdkResponseDecodeResult(
        value = GetSourcesSourceSourceTransactionsResponse.DefaultJson(
          json = SourcesCodecs.getSourcesSourceSourceTransactionsResponseCodecAlternative1Registry.select(listOf("GetSourcesSourceSourceTransactions.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetSourcesSourceSourceTransactionsResponse = GetSourcesSourceSourceTransactionsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetSourcesSourceSourceTransactionsSourceTransaction`. Non-success alternatives are
   * not converted into success values.
   */
  public sealed interface GetSourcesSourceSourceTransactionsSourceTransactionResponse {
    public class SuccessJson(
      public val json: SourceTransaction,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetSourcesSourceSourceTransactionsSourceTransactionResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetSourcesSourceSourceTransactionsSourceTransactionResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetSourcesSourceSourceTransactionsSourceTransactionResponse
  }

  private object GetSourcesSourceSourceTransactionsSourceTransactionResponseDecoder : SdkResponseAlternativeDecoder<GetSourcesSourceSourceTransactionsSourceTransactionResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetSourcesSourceSourceTransactionsSourceTransactionResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetSourcesSourceSourceTransactionsSourceTransactionResponse> = when {
      alternative.id == "GetSourcesSourceSourceTransactionsSourceTransaction.response.alternative0" -> SdkResponseDecodeResult(
        value = GetSourcesSourceSourceTransactionsSourceTransactionResponse.SuccessJson(
          json = SourcesCodecs.getSourcesSourceSourceTransactionsSourceTransactionResponseCodecAlternative0Registry.select(listOf("GetSourcesSourceSourceTransactionsSourceTransaction.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetSourcesSourceSourceTransactionsSourceTransaction.response.alternative1" -> SdkResponseDecodeResult(
        value = GetSourcesSourceSourceTransactionsSourceTransactionResponse.DefaultJson(
          json = SourcesCodecs.getSourcesSourceSourceTransactionsSourceTransactionResponseCodecAlternative1Registry.select(listOf("GetSourcesSourceSourceTransactionsSourceTransaction.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetSourcesSourceSourceTransactionsSourceTransactionResponse = GetSourcesSourceSourceTransactionsSourceTransactionResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostSources`. Non-success alternatives are not converted into success values.
   */
  public sealed interface PostSourcesResponse {
    public class SuccessJson(
      public val json: Source,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostSourcesResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostSourcesResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostSourcesResponse
  }

  private object PostSourcesResponseDecoder : SdkResponseAlternativeDecoder<PostSourcesResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostSourcesResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostSourcesResponse> = when {
      alternative.id == "PostSources.response.alternative0" -> SdkResponseDecodeResult(
        value = PostSourcesResponse.SuccessJson(
          json = SourcesCodecs.postSourcesResponseCodecAlternative0Registry.select(listOf("PostSources.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostSources.response.alternative1" -> SdkResponseDecodeResult(
        value = PostSourcesResponse.DefaultJson(
          json = SourcesCodecs.postSourcesResponseCodecAlternative1Registry.select(listOf("PostSources.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostSourcesResponse = PostSourcesResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostSourcesSource`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface PostSourcesSourceResponse {
    public class SuccessJson(
      public val json: Source,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostSourcesSourceResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostSourcesSourceResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostSourcesSourceResponse
  }

  private object PostSourcesSourceResponseDecoder : SdkResponseAlternativeDecoder<PostSourcesSourceResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostSourcesSourceResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostSourcesSourceResponse> = when {
      alternative.id == "PostSourcesSource.response.alternative0" -> SdkResponseDecodeResult(
        value = PostSourcesSourceResponse.SuccessJson(
          json = SourcesCodecs.postSourcesSourceResponseCodecAlternative0Registry.select(listOf("PostSourcesSource.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostSourcesSource.response.alternative1" -> SdkResponseDecodeResult(
        value = PostSourcesSourceResponse.DefaultJson(
          json = SourcesCodecs.postSourcesSourceResponseCodecAlternative1Registry.select(listOf("PostSourcesSource.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostSourcesSourceResponse = PostSourcesSourceResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostSourcesSourceVerify`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface PostSourcesSourceVerifyResponse {
    public class SuccessJson(
      public val json: Source,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostSourcesSourceVerifyResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostSourcesSourceVerifyResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostSourcesSourceVerifyResponse
  }

  private object PostSourcesSourceVerifyResponseDecoder : SdkResponseAlternativeDecoder<PostSourcesSourceVerifyResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostSourcesSourceVerifyResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostSourcesSourceVerifyResponse> = when {
      alternative.id == "PostSourcesSourceVerify.response.alternative0" -> SdkResponseDecodeResult(
        value = PostSourcesSourceVerifyResponse.SuccessJson(
          json = SourcesCodecs.postSourcesSourceVerifyResponseCodecAlternative0Registry.select(listOf("PostSourcesSourceVerify.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostSourcesSourceVerify.response.alternative1" -> SdkResponseDecodeResult(
        value = PostSourcesSourceVerifyResponse.DefaultJson(
          json = SourcesCodecs.postSourcesSourceVerifyResponseCodecAlternative1Registry.select(listOf("PostSourcesSourceVerify.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostSourcesSourceVerifyResponse = PostSourcesSourceVerifyResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    internal val getSourcesSourceMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetSourcesSource",
          method = "GET",
          path = "/v1/sources/{source}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "Source",
              mode = SdkResponseMode.BUFFERED,
              id = "GetSourcesSource.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetSourcesSource.response.alternative1",
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

    internal val getSourcesSourceMandateNotificationsMandateNotificationMetadata: OperationMetadata
        by lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetSourcesSourceMandateNotificationsMandateNotification",
          method = "GET",
          path = "/v1/sources/{source}/mandate_notifications/{mandate_notification}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "SourceMandateNotification",
              mode = SdkResponseMode.BUFFERED,
              id = "GetSourcesSourceMandateNotificationsMandateNotification.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetSourcesSourceMandateNotificationsMandateNotification.response.alternative1",
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

    internal val getSourcesSourceSourceTransactionsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetSourcesSourceSourceTransactions",
          method = "GET",
          path = "/v1/sources/{source}/source_transactions",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1SourcesSourceTransactionsGetResponse200JsonXf59dbfd7",
              mode = SdkResponseMode.BUFFERED,
              id = "GetSourcesSourceSourceTransactions.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetSourcesSourceSourceTransactions.response.alternative1",
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

    internal val getSourcesSourceSourceTransactionsSourceTransactionMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetSourcesSourceSourceTransactionsSourceTransaction",
          method = "GET",
          path = "/v1/sources/{source}/source_transactions/{source_transaction}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "SourceTransaction",
              mode = SdkResponseMode.BUFFERED,
              id = "GetSourcesSourceSourceTransactionsSourceTransaction.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetSourcesSourceSourceTransactionsSourceTransaction.response.alternative1",
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

    internal val postSourcesMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostSources",
          method = "POST",
          path = "/v1/sources",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "Source",
              mode = SdkResponseMode.BUFFERED,
              id = "PostSources.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostSources.response.alternative1",
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

    internal val postSourcesSourceMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostSourcesSource",
          method = "POST",
          path = "/v1/sources/{source}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "Source",
              mode = SdkResponseMode.BUFFERED,
              id = "PostSourcesSource.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostSourcesSource.response.alternative1",
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

    internal val postSourcesSourceVerifyMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostSourcesSourceVerify",
          method = "POST",
          path = "/v1/sources/{source}/verify",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "Source",
              mode = SdkResponseMode.BUFFERED,
              id = "PostSourcesSourceVerify.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostSourcesSourceVerify.response.alternative1",
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
