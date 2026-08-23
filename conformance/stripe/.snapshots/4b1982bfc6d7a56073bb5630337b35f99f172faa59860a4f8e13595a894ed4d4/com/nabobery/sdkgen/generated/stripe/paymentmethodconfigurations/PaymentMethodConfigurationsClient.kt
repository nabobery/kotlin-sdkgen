package com.nabobery.sdkgen.generated.stripe.paymentmethodconfigurations

import com.nabobery.sdkgen.generated.stripe.Error
import com.nabobery.sdkgen.generated.stripe.InlineV1PaymentMethodConfigurationsGetParameterXf4c00b1a
import com.nabobery.sdkgen.generated.stripe.InlineV1PaymentMethodConfigurationsGetResponse200JsonX684ee732
import com.nabobery.sdkgen.generated.stripe.InlineV1PaymentMethodConfigurationsPostRequestFormX5719ba0d
import com.nabobery.sdkgen.generated.stripe.InlineV1PaymentMethodConfigurationsPostRequestFormX71360f88
import com.nabobery.sdkgen.generated.stripe.PaymentMethodConfiguration
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

internal object PaymentMethodConfigurationsCodecs {
  internal const val GETPAYMENTMETHODCONFIGURATIONS_REQUEST_CODEC_ID: String =
      "GetPaymentMethodConfigurations.request"

  private val getPaymentMethodConfigurationsRequestCodec: MediaTypeCodec<JsonObject?> =
      GetPaymentMethodConfigurationsFormCodec

  private val getPaymentMethodConfigurationsResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1PaymentMethodConfigurationsGetResponse200JsonX684ee732> =
      KotlinxSerializationCodec("GetPaymentMethodConfigurations.response.alternative0", InlineV1PaymentMethodConfigurationsGetResponse200JsonX684ee732.Serializer, SdkJson)

  internal val getPaymentMethodConfigurationsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1PaymentMethodConfigurationsGetResponse200JsonX684ee732> =
      MediaTypeCodecRegistry.of(getPaymentMethodConfigurationsResponseCodecAlternative0Codec)

  private val getPaymentMethodConfigurationsResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetPaymentMethodConfigurations.response.alternative1", Error.Serializer, SdkJson)

  internal val getPaymentMethodConfigurationsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getPaymentMethodConfigurationsResponseCodecAlternative1Codec)

  internal val getPaymentMethodConfigurationsRequestCodecRegistry:
      MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getPaymentMethodConfigurationsRequestCodec)

  internal const val GETPAYMENTMETHODCONFIGURATIONSCONFIGURATION_REQUEST_CODEC_ID: String =
      "GetPaymentMethodConfigurationsConfiguration.request"

  private val getPaymentMethodConfigurationsConfigurationRequestCodec: MediaTypeCodec<JsonObject?> =
      GetPaymentMethodConfigurationsConfigurationFormCodec

  private val getPaymentMethodConfigurationsConfigurationResponseCodecAlternative0Codec:
      MediaTypeCodec<PaymentMethodConfiguration> =
      KotlinxSerializationCodec("GetPaymentMethodConfigurationsConfiguration.response.alternative0", PaymentMethodConfiguration.Serializer, SdkJson)

  internal val getPaymentMethodConfigurationsConfigurationResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<PaymentMethodConfiguration> =
      MediaTypeCodecRegistry.of(getPaymentMethodConfigurationsConfigurationResponseCodecAlternative0Codec)

  private val getPaymentMethodConfigurationsConfigurationResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetPaymentMethodConfigurationsConfiguration.response.alternative1", Error.Serializer, SdkJson)

  internal val getPaymentMethodConfigurationsConfigurationResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getPaymentMethodConfigurationsConfigurationResponseCodecAlternative1Codec)

  internal val getPaymentMethodConfigurationsConfigurationRequestCodecRegistry:
      MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getPaymentMethodConfigurationsConfigurationRequestCodec)

  internal const val POSTPAYMENTMETHODCONFIGURATIONS_REQUEST_CODEC_ID: String =
      "PostPaymentMethodConfigurations.request"

  private val postPaymentMethodConfigurationsRequestCodec:
      MediaTypeCodec<InlineV1PaymentMethodConfigurationsPostRequestFormX5719ba0d?> =
      PostPaymentMethodConfigurationsFormCodec

  private val postPaymentMethodConfigurationsResponseCodecAlternative0Codec:
      MediaTypeCodec<PaymentMethodConfiguration> =
      KotlinxSerializationCodec("PostPaymentMethodConfigurations.response.alternative0", PaymentMethodConfiguration.Serializer, SdkJson)

  internal val postPaymentMethodConfigurationsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<PaymentMethodConfiguration> =
      MediaTypeCodecRegistry.of(postPaymentMethodConfigurationsResponseCodecAlternative0Codec)

  private val postPaymentMethodConfigurationsResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostPaymentMethodConfigurations.response.alternative1", Error.Serializer, SdkJson)

  internal val postPaymentMethodConfigurationsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postPaymentMethodConfigurationsResponseCodecAlternative1Codec)

  internal val postPaymentMethodConfigurationsRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1PaymentMethodConfigurationsPostRequestFormX5719ba0d?> =
      MediaTypeCodecRegistry.of(postPaymentMethodConfigurationsRequestCodec)

  internal const val POSTPAYMENTMETHODCONFIGURATIONSCONFIGURATION_REQUEST_CODEC_ID: String =
      "PostPaymentMethodConfigurationsConfiguration.request"

  private val postPaymentMethodConfigurationsConfigurationRequestCodec:
      MediaTypeCodec<InlineV1PaymentMethodConfigurationsPostRequestFormX71360f88?> =
      PostPaymentMethodConfigurationsConfigurationFormCodec

  private val postPaymentMethodConfigurationsConfigurationResponseCodecAlternative0Codec:
      MediaTypeCodec<PaymentMethodConfiguration> =
      KotlinxSerializationCodec("PostPaymentMethodConfigurationsConfiguration.response.alternative0", PaymentMethodConfiguration.Serializer, SdkJson)

  internal val postPaymentMethodConfigurationsConfigurationResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<PaymentMethodConfiguration> =
      MediaTypeCodecRegistry.of(postPaymentMethodConfigurationsConfigurationResponseCodecAlternative0Codec)

  private val postPaymentMethodConfigurationsConfigurationResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostPaymentMethodConfigurationsConfiguration.response.alternative1", Error.Serializer, SdkJson)

  internal val postPaymentMethodConfigurationsConfigurationResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postPaymentMethodConfigurationsConfigurationResponseCodecAlternative1Codec)

  internal val postPaymentMethodConfigurationsConfigurationRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1PaymentMethodConfigurationsPostRequestFormX71360f88?> =
      MediaTypeCodecRegistry.of(postPaymentMethodConfigurationsConfigurationRequestCodec)

  internal object GetPaymentMethodConfigurationsFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetPaymentMethodConfigurations.request"

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

  internal object GetPaymentMethodConfigurationsConfigurationFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetPaymentMethodConfigurationsConfiguration.request"

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

  internal object PostPaymentMethodConfigurationsFormCodec : MediaTypeCodec<InlineV1PaymentMethodConfigurationsPostRequestFormX5719ba0d?> {
    override val id: String = "PostPaymentMethodConfigurations.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1PaymentMethodConfigurationsPostRequestFormX5719ba0d?, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      request.acssDebit?.let { formValue0 ->
        formValue0.displayPreference?.let { formValue2 ->
          formValue2.preference?.let { formValue4 ->
            form.add("acss_debit" + "[display_preference]" + "[preference]", formValue4.value)
          }
        }
      }
      request.affirm?.let { formValue0 ->
        formValue0.displayPreference?.let { formValue2 ->
          formValue2.preference?.let { formValue4 ->
            form.add("affirm" + "[display_preference]" + "[preference]", formValue4.value)
          }
        }
      }
      request.afterpayClearpay?.let { formValue0 ->
        formValue0.displayPreference?.let { formValue2 ->
          formValue2.preference?.let { formValue4 ->
            form.add("afterpay_clearpay" + "[display_preference]" + "[preference]", formValue4.value)
          }
        }
      }
      request.alipay?.let { formValue0 ->
        formValue0.displayPreference?.let { formValue2 ->
          formValue2.preference?.let { formValue4 ->
            form.add("alipay" + "[display_preference]" + "[preference]", formValue4.value)
          }
        }
      }
      request.alma?.let { formValue0 ->
        formValue0.displayPreference?.let { formValue2 ->
          formValue2.preference?.let { formValue4 ->
            form.add("alma" + "[display_preference]" + "[preference]", formValue4.value)
          }
        }
      }
      request.amazonPay?.let { formValue0 ->
        formValue0.displayPreference?.let { formValue2 ->
          formValue2.preference?.let { formValue4 ->
            form.add("amazon_pay" + "[display_preference]" + "[preference]", formValue4.value)
          }
        }
      }
      request.applePay?.let { formValue0 ->
        formValue0.displayPreference?.let { formValue2 ->
          formValue2.preference?.let { formValue4 ->
            form.add("apple_pay" + "[display_preference]" + "[preference]", formValue4.value)
          }
        }
      }
      request.applePayLater?.let { formValue0 ->
        formValue0.displayPreference?.let { formValue2 ->
          formValue2.preference?.let { formValue4 ->
            form.add("apple_pay_later" + "[display_preference]" + "[preference]", formValue4.value)
          }
        }
      }
      request.auBecsDebit?.let { formValue0 ->
        formValue0.displayPreference?.let { formValue2 ->
          formValue2.preference?.let { formValue4 ->
            form.add("au_becs_debit" + "[display_preference]" + "[preference]", formValue4.value)
          }
        }
      }
      request.bacsDebit?.let { formValue0 ->
        formValue0.displayPreference?.let { formValue2 ->
          formValue2.preference?.let { formValue4 ->
            form.add("bacs_debit" + "[display_preference]" + "[preference]", formValue4.value)
          }
        }
      }
      request.bancontact?.let { formValue0 ->
        formValue0.displayPreference?.let { formValue2 ->
          formValue2.preference?.let { formValue4 ->
            form.add("bancontact" + "[display_preference]" + "[preference]", formValue4.value)
          }
        }
      }
      request.billie?.let { formValue0 ->
        formValue0.displayPreference?.let { formValue2 ->
          formValue2.preference?.let { formValue4 ->
            form.add("billie" + "[display_preference]" + "[preference]", formValue4.value)
          }
        }
      }
      request.bizum?.let { formValue0 ->
        formValue0.displayPreference?.let { formValue2 ->
          formValue2.preference?.let { formValue4 ->
            form.add("bizum" + "[display_preference]" + "[preference]", formValue4.value)
          }
        }
      }
      request.blik?.let { formValue0 ->
        formValue0.displayPreference?.let { formValue2 ->
          formValue2.preference?.let { formValue4 ->
            form.add("blik" + "[display_preference]" + "[preference]", formValue4.value)
          }
        }
      }
      request.boleto?.let { formValue0 ->
        formValue0.displayPreference?.let { formValue2 ->
          formValue2.preference?.let { formValue4 ->
            form.add("boleto" + "[display_preference]" + "[preference]", formValue4.value)
          }
        }
      }
      request.card?.let { formValue0 ->
        formValue0.displayPreference?.let { formValue2 ->
          formValue2.preference?.let { formValue4 ->
            form.add("card" + "[display_preference]" + "[preference]", formValue4.value)
          }
        }
      }
      request.cartesBancaires?.let { formValue0 ->
        formValue0.displayPreference?.let { formValue2 ->
          formValue2.preference?.let { formValue4 ->
            form.add("cartes_bancaires" + "[display_preference]" + "[preference]", formValue4.value)
          }
        }
      }
      request.cashapp?.let { formValue0 ->
        formValue0.displayPreference?.let { formValue2 ->
          formValue2.preference?.let { formValue4 ->
            form.add("cashapp" + "[display_preference]" + "[preference]", formValue4.value)
          }
        }
      }
      request.crypto?.let { formValue0 ->
        formValue0.displayPreference?.let { formValue2 ->
          formValue2.preference?.let { formValue4 ->
            form.add("crypto" + "[display_preference]" + "[preference]", formValue4.value)
          }
        }
      }
      request.customerBalance?.let { formValue0 ->
        formValue0.displayPreference?.let { formValue2 ->
          formValue2.preference?.let { formValue4 ->
            form.add("customer_balance" + "[display_preference]" + "[preference]", formValue4.value)
          }
        }
      }
      request.eps?.let { formValue0 ->
        formValue0.displayPreference?.let { formValue2 ->
          formValue2.preference?.let { formValue4 ->
            form.add("eps" + "[display_preference]" + "[preference]", formValue4.value)
          }
        }
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
      request.fpx?.let { formValue0 ->
        formValue0.displayPreference?.let { formValue2 ->
          formValue2.preference?.let { formValue4 ->
            form.add("fpx" + "[display_preference]" + "[preference]", formValue4.value)
          }
        }
      }
      request.frMealVoucherConecs?.let { formValue0 ->
        formValue0.displayPreference?.let { formValue2 ->
          formValue2.preference?.let { formValue4 ->
            form.add("fr_meal_voucher_conecs" + "[display_preference]" + "[preference]", formValue4.value)
          }
        }
      }
      request.giropay?.let { formValue0 ->
        formValue0.displayPreference?.let { formValue2 ->
          formValue2.preference?.let { formValue4 ->
            form.add("giropay" + "[display_preference]" + "[preference]", formValue4.value)
          }
        }
      }
      request.googlePay?.let { formValue0 ->
        formValue0.displayPreference?.let { formValue2 ->
          formValue2.preference?.let { formValue4 ->
            form.add("google_pay" + "[display_preference]" + "[preference]", formValue4.value)
          }
        }
      }
      request.grabpay?.let { formValue0 ->
        formValue0.displayPreference?.let { formValue2 ->
          formValue2.preference?.let { formValue4 ->
            form.add("grabpay" + "[display_preference]" + "[preference]", formValue4.value)
          }
        }
      }
      request.ideal?.let { formValue0 ->
        formValue0.displayPreference?.let { formValue2 ->
          formValue2.preference?.let { formValue4 ->
            form.add("ideal" + "[display_preference]" + "[preference]", formValue4.value)
          }
        }
      }
      request.jcb?.let { formValue0 ->
        formValue0.displayPreference?.let { formValue2 ->
          formValue2.preference?.let { formValue4 ->
            form.add("jcb" + "[display_preference]" + "[preference]", formValue4.value)
          }
        }
      }
      request.kakaoPay?.let { formValue0 ->
        formValue0.displayPreference?.let { formValue2 ->
          formValue2.preference?.let { formValue4 ->
            form.add("kakao_pay" + "[display_preference]" + "[preference]", formValue4.value)
          }
        }
      }
      request.klarna?.let { formValue0 ->
        formValue0.displayPreference?.let { formValue2 ->
          formValue2.preference?.let { formValue4 ->
            form.add("klarna" + "[display_preference]" + "[preference]", formValue4.value)
          }
        }
      }
      request.konbini?.let { formValue0 ->
        formValue0.displayPreference?.let { formValue2 ->
          formValue2.preference?.let { formValue4 ->
            form.add("konbini" + "[display_preference]" + "[preference]", formValue4.value)
          }
        }
      }
      request.krCard?.let { formValue0 ->
        formValue0.displayPreference?.let { formValue2 ->
          formValue2.preference?.let { formValue4 ->
            form.add("kr_card" + "[display_preference]" + "[preference]", formValue4.value)
          }
        }
      }
      request.link?.let { formValue0 ->
        formValue0.displayPreference?.let { formValue2 ->
          formValue2.preference?.let { formValue4 ->
            form.add("link" + "[display_preference]" + "[preference]", formValue4.value)
          }
        }
      }
      request.mbWay?.let { formValue0 ->
        formValue0.displayPreference?.let { formValue2 ->
          formValue2.preference?.let { formValue4 ->
            form.add("mb_way" + "[display_preference]" + "[preference]", formValue4.value)
          }
        }
      }
      request.mobilepay?.let { formValue0 ->
        formValue0.displayPreference?.let { formValue2 ->
          formValue2.preference?.let { formValue4 ->
            form.add("mobilepay" + "[display_preference]" + "[preference]", formValue4.value)
          }
        }
      }
      request.multibanco?.let { formValue0 ->
        formValue0.displayPreference?.let { formValue2 ->
          formValue2.preference?.let { formValue4 ->
            form.add("multibanco" + "[display_preference]" + "[preference]", formValue4.value)
          }
        }
      }
      request.name?.let { formValue0 ->
        form.add("name", formValue0)
      }
      request.naverPay?.let { formValue0 ->
        formValue0.displayPreference?.let { formValue2 ->
          formValue2.preference?.let { formValue4 ->
            form.add("naver_pay" + "[display_preference]" + "[preference]", formValue4.value)
          }
        }
      }
      request.nzBankAccount?.let { formValue0 ->
        formValue0.displayPreference?.let { formValue2 ->
          formValue2.preference?.let { formValue4 ->
            form.add("nz_bank_account" + "[display_preference]" + "[preference]", formValue4.value)
          }
        }
      }
      request.oxxo?.let { formValue0 ->
        formValue0.displayPreference?.let { formValue2 ->
          formValue2.preference?.let { formValue4 ->
            form.add("oxxo" + "[display_preference]" + "[preference]", formValue4.value)
          }
        }
      }
      request.p24?.let { formValue0 ->
        formValue0.displayPreference?.let { formValue2 ->
          formValue2.preference?.let { formValue4 ->
            form.add("p24" + "[display_preference]" + "[preference]", formValue4.value)
          }
        }
      }
      request.parent?.let { formValue0 ->
        form.add("parent", formValue0)
      }
      request.payByBank?.let { formValue0 ->
        formValue0.displayPreference?.let { formValue2 ->
          formValue2.preference?.let { formValue4 ->
            form.add("pay_by_bank" + "[display_preference]" + "[preference]", formValue4.value)
          }
        }
      }
      request.payco?.let { formValue0 ->
        formValue0.displayPreference?.let { formValue2 ->
          formValue2.preference?.let { formValue4 ->
            form.add("payco" + "[display_preference]" + "[preference]", formValue4.value)
          }
        }
      }
      request.paynow?.let { formValue0 ->
        formValue0.displayPreference?.let { formValue2 ->
          formValue2.preference?.let { formValue4 ->
            form.add("paynow" + "[display_preference]" + "[preference]", formValue4.value)
          }
        }
      }
      request.paypal?.let { formValue0 ->
        formValue0.displayPreference?.let { formValue2 ->
          formValue2.preference?.let { formValue4 ->
            form.add("paypal" + "[display_preference]" + "[preference]", formValue4.value)
          }
        }
      }
      request.payto?.let { formValue0 ->
        formValue0.displayPreference?.let { formValue2 ->
          formValue2.preference?.let { formValue4 ->
            form.add("payto" + "[display_preference]" + "[preference]", formValue4.value)
          }
        }
      }
      request.pix?.let { formValue0 ->
        formValue0.displayPreference?.let { formValue2 ->
          formValue2.preference?.let { formValue4 ->
            form.add("pix" + "[display_preference]" + "[preference]", formValue4.value)
          }
        }
      }
      request.promptpay?.let { formValue0 ->
        formValue0.displayPreference?.let { formValue2 ->
          formValue2.preference?.let { formValue4 ->
            form.add("promptpay" + "[display_preference]" + "[preference]", formValue4.value)
          }
        }
      }
      request.revolutPay?.let { formValue0 ->
        formValue0.displayPreference?.let { formValue2 ->
          formValue2.preference?.let { formValue4 ->
            form.add("revolut_pay" + "[display_preference]" + "[preference]", formValue4.value)
          }
        }
      }
      request.samsungPay?.let { formValue0 ->
        formValue0.displayPreference?.let { formValue2 ->
          formValue2.preference?.let { formValue4 ->
            form.add("samsung_pay" + "[display_preference]" + "[preference]", formValue4.value)
          }
        }
      }
      request.satispay?.let { formValue0 ->
        formValue0.displayPreference?.let { formValue2 ->
          formValue2.preference?.let { formValue4 ->
            form.add("satispay" + "[display_preference]" + "[preference]", formValue4.value)
          }
        }
      }
      request.scalapay?.let { formValue0 ->
        formValue0.displayPreference?.let { formValue2 ->
          formValue2.preference?.let { formValue4 ->
            form.add("scalapay" + "[display_preference]" + "[preference]", formValue4.value)
          }
        }
      }
      request.sepaDebit?.let { formValue0 ->
        formValue0.displayPreference?.let { formValue2 ->
          formValue2.preference?.let { formValue4 ->
            form.add("sepa_debit" + "[display_preference]" + "[preference]", formValue4.value)
          }
        }
      }
      request.sofort?.let { formValue0 ->
        formValue0.displayPreference?.let { formValue2 ->
          formValue2.preference?.let { formValue4 ->
            form.add("sofort" + "[display_preference]" + "[preference]", formValue4.value)
          }
        }
      }
      request.sunbit?.let { formValue0 ->
        formValue0.displayPreference?.let { formValue2 ->
          formValue2.preference?.let { formValue4 ->
            form.add("sunbit" + "[display_preference]" + "[preference]", formValue4.value)
          }
        }
      }
      request.swish?.let { formValue0 ->
        formValue0.displayPreference?.let { formValue2 ->
          formValue2.preference?.let { formValue4 ->
            form.add("swish" + "[display_preference]" + "[preference]", formValue4.value)
          }
        }
      }
      request.twint?.let { formValue0 ->
        formValue0.displayPreference?.let { formValue2 ->
          formValue2.preference?.let { formValue4 ->
            form.add("twint" + "[display_preference]" + "[preference]", formValue4.value)
          }
        }
      }
      request.upi?.let { formValue0 ->
        formValue0.displayPreference?.let { formValue2 ->
          formValue2.preference?.let { formValue4 ->
            form.add("upi" + "[display_preference]" + "[preference]", formValue4.value)
          }
        }
      }
      request.usBankAccount?.let { formValue0 ->
        formValue0.displayPreference?.let { formValue2 ->
          formValue2.preference?.let { formValue4 ->
            form.add("us_bank_account" + "[display_preference]" + "[preference]", formValue4.value)
          }
        }
      }
      request.wechatPay?.let { formValue0 ->
        formValue0.displayPreference?.let { formValue2 ->
          formValue2.preference?.let { formValue4 ->
            form.add("wechat_pay" + "[display_preference]" + "[preference]", formValue4.value)
          }
        }
      }
      request.zip?.let { formValue0 ->
        formValue0.displayPreference?.let { formValue2 ->
          formValue2.preference?.let { formValue4 ->
            form.add("zip" + "[display_preference]" + "[preference]", formValue4.value)
          }
        }
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1PaymentMethodConfigurationsPostRequestFormX5719ba0d? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  internal object PostPaymentMethodConfigurationsConfigurationFormCodec : MediaTypeCodec<InlineV1PaymentMethodConfigurationsPostRequestFormX71360f88?> {
    override val id: String = "PostPaymentMethodConfigurationsConfiguration.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1PaymentMethodConfigurationsPostRequestFormX71360f88?, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      request.acssDebit?.let { formValue0 ->
        formValue0.displayPreference?.let { formValue2 ->
          formValue2.preference?.let { formValue4 ->
            form.add("acss_debit" + "[display_preference]" + "[preference]", formValue4.value)
          }
        }
      }
      request.active?.let { formValue0 ->
        form.add("active", formValue0.toString())
      }
      request.affirm?.let { formValue0 ->
        formValue0.displayPreference?.let { formValue2 ->
          formValue2.preference?.let { formValue4 ->
            form.add("affirm" + "[display_preference]" + "[preference]", formValue4.value)
          }
        }
      }
      request.afterpayClearpay?.let { formValue0 ->
        formValue0.displayPreference?.let { formValue2 ->
          formValue2.preference?.let { formValue4 ->
            form.add("afterpay_clearpay" + "[display_preference]" + "[preference]", formValue4.value)
          }
        }
      }
      request.alipay?.let { formValue0 ->
        formValue0.displayPreference?.let { formValue2 ->
          formValue2.preference?.let { formValue4 ->
            form.add("alipay" + "[display_preference]" + "[preference]", formValue4.value)
          }
        }
      }
      request.alma?.let { formValue0 ->
        formValue0.displayPreference?.let { formValue2 ->
          formValue2.preference?.let { formValue4 ->
            form.add("alma" + "[display_preference]" + "[preference]", formValue4.value)
          }
        }
      }
      request.amazonPay?.let { formValue0 ->
        formValue0.displayPreference?.let { formValue2 ->
          formValue2.preference?.let { formValue4 ->
            form.add("amazon_pay" + "[display_preference]" + "[preference]", formValue4.value)
          }
        }
      }
      request.applePay?.let { formValue0 ->
        formValue0.displayPreference?.let { formValue2 ->
          formValue2.preference?.let { formValue4 ->
            form.add("apple_pay" + "[display_preference]" + "[preference]", formValue4.value)
          }
        }
      }
      request.applePayLater?.let { formValue0 ->
        formValue0.displayPreference?.let { formValue2 ->
          formValue2.preference?.let { formValue4 ->
            form.add("apple_pay_later" + "[display_preference]" + "[preference]", formValue4.value)
          }
        }
      }
      request.auBecsDebit?.let { formValue0 ->
        formValue0.displayPreference?.let { formValue2 ->
          formValue2.preference?.let { formValue4 ->
            form.add("au_becs_debit" + "[display_preference]" + "[preference]", formValue4.value)
          }
        }
      }
      request.bacsDebit?.let { formValue0 ->
        formValue0.displayPreference?.let { formValue2 ->
          formValue2.preference?.let { formValue4 ->
            form.add("bacs_debit" + "[display_preference]" + "[preference]", formValue4.value)
          }
        }
      }
      request.bancontact?.let { formValue0 ->
        formValue0.displayPreference?.let { formValue2 ->
          formValue2.preference?.let { formValue4 ->
            form.add("bancontact" + "[display_preference]" + "[preference]", formValue4.value)
          }
        }
      }
      request.billie?.let { formValue0 ->
        formValue0.displayPreference?.let { formValue2 ->
          formValue2.preference?.let { formValue4 ->
            form.add("billie" + "[display_preference]" + "[preference]", formValue4.value)
          }
        }
      }
      request.bizum?.let { formValue0 ->
        formValue0.displayPreference?.let { formValue2 ->
          formValue2.preference?.let { formValue4 ->
            form.add("bizum" + "[display_preference]" + "[preference]", formValue4.value)
          }
        }
      }
      request.blik?.let { formValue0 ->
        formValue0.displayPreference?.let { formValue2 ->
          formValue2.preference?.let { formValue4 ->
            form.add("blik" + "[display_preference]" + "[preference]", formValue4.value)
          }
        }
      }
      request.boleto?.let { formValue0 ->
        formValue0.displayPreference?.let { formValue2 ->
          formValue2.preference?.let { formValue4 ->
            form.add("boleto" + "[display_preference]" + "[preference]", formValue4.value)
          }
        }
      }
      request.card?.let { formValue0 ->
        formValue0.displayPreference?.let { formValue2 ->
          formValue2.preference?.let { formValue4 ->
            form.add("card" + "[display_preference]" + "[preference]", formValue4.value)
          }
        }
      }
      request.cartesBancaires?.let { formValue0 ->
        formValue0.displayPreference?.let { formValue2 ->
          formValue2.preference?.let { formValue4 ->
            form.add("cartes_bancaires" + "[display_preference]" + "[preference]", formValue4.value)
          }
        }
      }
      request.cashapp?.let { formValue0 ->
        formValue0.displayPreference?.let { formValue2 ->
          formValue2.preference?.let { formValue4 ->
            form.add("cashapp" + "[display_preference]" + "[preference]", formValue4.value)
          }
        }
      }
      request.crypto?.let { formValue0 ->
        formValue0.displayPreference?.let { formValue2 ->
          formValue2.preference?.let { formValue4 ->
            form.add("crypto" + "[display_preference]" + "[preference]", formValue4.value)
          }
        }
      }
      request.customerBalance?.let { formValue0 ->
        formValue0.displayPreference?.let { formValue2 ->
          formValue2.preference?.let { formValue4 ->
            form.add("customer_balance" + "[display_preference]" + "[preference]", formValue4.value)
          }
        }
      }
      request.eps?.let { formValue0 ->
        formValue0.displayPreference?.let { formValue2 ->
          formValue2.preference?.let { formValue4 ->
            form.add("eps" + "[display_preference]" + "[preference]", formValue4.value)
          }
        }
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
      request.fpx?.let { formValue0 ->
        formValue0.displayPreference?.let { formValue2 ->
          formValue2.preference?.let { formValue4 ->
            form.add("fpx" + "[display_preference]" + "[preference]", formValue4.value)
          }
        }
      }
      request.frMealVoucherConecs?.let { formValue0 ->
        formValue0.displayPreference?.let { formValue2 ->
          formValue2.preference?.let { formValue4 ->
            form.add("fr_meal_voucher_conecs" + "[display_preference]" + "[preference]", formValue4.value)
          }
        }
      }
      request.giropay?.let { formValue0 ->
        formValue0.displayPreference?.let { formValue2 ->
          formValue2.preference?.let { formValue4 ->
            form.add("giropay" + "[display_preference]" + "[preference]", formValue4.value)
          }
        }
      }
      request.googlePay?.let { formValue0 ->
        formValue0.displayPreference?.let { formValue2 ->
          formValue2.preference?.let { formValue4 ->
            form.add("google_pay" + "[display_preference]" + "[preference]", formValue4.value)
          }
        }
      }
      request.grabpay?.let { formValue0 ->
        formValue0.displayPreference?.let { formValue2 ->
          formValue2.preference?.let { formValue4 ->
            form.add("grabpay" + "[display_preference]" + "[preference]", formValue4.value)
          }
        }
      }
      request.ideal?.let { formValue0 ->
        formValue0.displayPreference?.let { formValue2 ->
          formValue2.preference?.let { formValue4 ->
            form.add("ideal" + "[display_preference]" + "[preference]", formValue4.value)
          }
        }
      }
      request.jcb?.let { formValue0 ->
        formValue0.displayPreference?.let { formValue2 ->
          formValue2.preference?.let { formValue4 ->
            form.add("jcb" + "[display_preference]" + "[preference]", formValue4.value)
          }
        }
      }
      request.kakaoPay?.let { formValue0 ->
        formValue0.displayPreference?.let { formValue2 ->
          formValue2.preference?.let { formValue4 ->
            form.add("kakao_pay" + "[display_preference]" + "[preference]", formValue4.value)
          }
        }
      }
      request.klarna?.let { formValue0 ->
        formValue0.displayPreference?.let { formValue2 ->
          formValue2.preference?.let { formValue4 ->
            form.add("klarna" + "[display_preference]" + "[preference]", formValue4.value)
          }
        }
      }
      request.konbini?.let { formValue0 ->
        formValue0.displayPreference?.let { formValue2 ->
          formValue2.preference?.let { formValue4 ->
            form.add("konbini" + "[display_preference]" + "[preference]", formValue4.value)
          }
        }
      }
      request.krCard?.let { formValue0 ->
        formValue0.displayPreference?.let { formValue2 ->
          formValue2.preference?.let { formValue4 ->
            form.add("kr_card" + "[display_preference]" + "[preference]", formValue4.value)
          }
        }
      }
      request.link?.let { formValue0 ->
        formValue0.displayPreference?.let { formValue2 ->
          formValue2.preference?.let { formValue4 ->
            form.add("link" + "[display_preference]" + "[preference]", formValue4.value)
          }
        }
      }
      request.mbWay?.let { formValue0 ->
        formValue0.displayPreference?.let { formValue2 ->
          formValue2.preference?.let { formValue4 ->
            form.add("mb_way" + "[display_preference]" + "[preference]", formValue4.value)
          }
        }
      }
      request.mobilepay?.let { formValue0 ->
        formValue0.displayPreference?.let { formValue2 ->
          formValue2.preference?.let { formValue4 ->
            form.add("mobilepay" + "[display_preference]" + "[preference]", formValue4.value)
          }
        }
      }
      request.multibanco?.let { formValue0 ->
        formValue0.displayPreference?.let { formValue2 ->
          formValue2.preference?.let { formValue4 ->
            form.add("multibanco" + "[display_preference]" + "[preference]", formValue4.value)
          }
        }
      }
      request.name?.let { formValue0 ->
        form.add("name", formValue0)
      }
      request.naverPay?.let { formValue0 ->
        formValue0.displayPreference?.let { formValue2 ->
          formValue2.preference?.let { formValue4 ->
            form.add("naver_pay" + "[display_preference]" + "[preference]", formValue4.value)
          }
        }
      }
      request.nzBankAccount?.let { formValue0 ->
        formValue0.displayPreference?.let { formValue2 ->
          formValue2.preference?.let { formValue4 ->
            form.add("nz_bank_account" + "[display_preference]" + "[preference]", formValue4.value)
          }
        }
      }
      request.oxxo?.let { formValue0 ->
        formValue0.displayPreference?.let { formValue2 ->
          formValue2.preference?.let { formValue4 ->
            form.add("oxxo" + "[display_preference]" + "[preference]", formValue4.value)
          }
        }
      }
      request.p24?.let { formValue0 ->
        formValue0.displayPreference?.let { formValue2 ->
          formValue2.preference?.let { formValue4 ->
            form.add("p24" + "[display_preference]" + "[preference]", formValue4.value)
          }
        }
      }
      request.payByBank?.let { formValue0 ->
        formValue0.displayPreference?.let { formValue2 ->
          formValue2.preference?.let { formValue4 ->
            form.add("pay_by_bank" + "[display_preference]" + "[preference]", formValue4.value)
          }
        }
      }
      request.payco?.let { formValue0 ->
        formValue0.displayPreference?.let { formValue2 ->
          formValue2.preference?.let { formValue4 ->
            form.add("payco" + "[display_preference]" + "[preference]", formValue4.value)
          }
        }
      }
      request.paynow?.let { formValue0 ->
        formValue0.displayPreference?.let { formValue2 ->
          formValue2.preference?.let { formValue4 ->
            form.add("paynow" + "[display_preference]" + "[preference]", formValue4.value)
          }
        }
      }
      request.paypal?.let { formValue0 ->
        formValue0.displayPreference?.let { formValue2 ->
          formValue2.preference?.let { formValue4 ->
            form.add("paypal" + "[display_preference]" + "[preference]", formValue4.value)
          }
        }
      }
      request.payto?.let { formValue0 ->
        formValue0.displayPreference?.let { formValue2 ->
          formValue2.preference?.let { formValue4 ->
            form.add("payto" + "[display_preference]" + "[preference]", formValue4.value)
          }
        }
      }
      request.pix?.let { formValue0 ->
        formValue0.displayPreference?.let { formValue2 ->
          formValue2.preference?.let { formValue4 ->
            form.add("pix" + "[display_preference]" + "[preference]", formValue4.value)
          }
        }
      }
      request.promptpay?.let { formValue0 ->
        formValue0.displayPreference?.let { formValue2 ->
          formValue2.preference?.let { formValue4 ->
            form.add("promptpay" + "[display_preference]" + "[preference]", formValue4.value)
          }
        }
      }
      request.revolutPay?.let { formValue0 ->
        formValue0.displayPreference?.let { formValue2 ->
          formValue2.preference?.let { formValue4 ->
            form.add("revolut_pay" + "[display_preference]" + "[preference]", formValue4.value)
          }
        }
      }
      request.samsungPay?.let { formValue0 ->
        formValue0.displayPreference?.let { formValue2 ->
          formValue2.preference?.let { formValue4 ->
            form.add("samsung_pay" + "[display_preference]" + "[preference]", formValue4.value)
          }
        }
      }
      request.satispay?.let { formValue0 ->
        formValue0.displayPreference?.let { formValue2 ->
          formValue2.preference?.let { formValue4 ->
            form.add("satispay" + "[display_preference]" + "[preference]", formValue4.value)
          }
        }
      }
      request.scalapay?.let { formValue0 ->
        formValue0.displayPreference?.let { formValue2 ->
          formValue2.preference?.let { formValue4 ->
            form.add("scalapay" + "[display_preference]" + "[preference]", formValue4.value)
          }
        }
      }
      request.sepaDebit?.let { formValue0 ->
        formValue0.displayPreference?.let { formValue2 ->
          formValue2.preference?.let { formValue4 ->
            form.add("sepa_debit" + "[display_preference]" + "[preference]", formValue4.value)
          }
        }
      }
      request.sofort?.let { formValue0 ->
        formValue0.displayPreference?.let { formValue2 ->
          formValue2.preference?.let { formValue4 ->
            form.add("sofort" + "[display_preference]" + "[preference]", formValue4.value)
          }
        }
      }
      request.sunbit?.let { formValue0 ->
        formValue0.displayPreference?.let { formValue2 ->
          formValue2.preference?.let { formValue4 ->
            form.add("sunbit" + "[display_preference]" + "[preference]", formValue4.value)
          }
        }
      }
      request.swish?.let { formValue0 ->
        formValue0.displayPreference?.let { formValue2 ->
          formValue2.preference?.let { formValue4 ->
            form.add("swish" + "[display_preference]" + "[preference]", formValue4.value)
          }
        }
      }
      request.twint?.let { formValue0 ->
        formValue0.displayPreference?.let { formValue2 ->
          formValue2.preference?.let { formValue4 ->
            form.add("twint" + "[display_preference]" + "[preference]", formValue4.value)
          }
        }
      }
      request.upi?.let { formValue0 ->
        formValue0.displayPreference?.let { formValue2 ->
          formValue2.preference?.let { formValue4 ->
            form.add("upi" + "[display_preference]" + "[preference]", formValue4.value)
          }
        }
      }
      request.usBankAccount?.let { formValue0 ->
        formValue0.displayPreference?.let { formValue2 ->
          formValue2.preference?.let { formValue4 ->
            form.add("us_bank_account" + "[display_preference]" + "[preference]", formValue4.value)
          }
        }
      }
      request.wechatPay?.let { formValue0 ->
        formValue0.displayPreference?.let { formValue2 ->
          formValue2.preference?.let { formValue4 ->
            form.add("wechat_pay" + "[display_preference]" + "[preference]", formValue4.value)
          }
        }
      }
      request.zip?.let { formValue0 ->
        formValue0.displayPreference?.let { formValue2 ->
          formValue2.preference?.let { formValue4 ->
            form.add("zip" + "[display_preference]" + "[preference]", formValue4.value)
          }
        }
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1PaymentMethodConfigurationsPostRequestFormX71360f88? {
      error("Form request codecs do not decode response bodies.")
    }
  }
}

/**
 * Client for the 'payment_method_configurations' group of Stripe API.
 */
public class PaymentMethodConfigurationsClient(
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
      SdkExecutor(transport, authentication = this@PaymentMethodConfigurationsClient.authentication)

  /**
   * <p>List payment method configurations</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param active Whether the configuration is active.
   * @param application The Connect application to filter by.
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
  public suspend fun getPaymentMethodConfigurationsWithResponse(
    request: JsonObject? = null,
    active: Boolean? = null,
    application: InlineV1PaymentMethodConfigurationsGetParameterXf4c00b1a? = null,
    endingBefore: String? = null,
    expand: List<String>? = null,
    limit: Int? = null,
    startingAfter: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetPaymentMethodConfigurationsResponse> = executor.executeWithResponse<JsonObject?, GetPaymentMethodConfigurationsResponse>(SdkExecutionRequest(getPaymentMethodConfigurationsMetadata, baseUri, request, listOf(PaymentMethodConfigurationsCodecs.GETPAYMENTMETHODCONFIGURATIONS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "active", values = active?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "application", values = application?.let { value ->
    val primitive = value.raw as? JsonPrimitive ?: error("Stripe-compatible deepObject scalar fallback requires a JSON primitive value")
    listOf(primitive.content)
    }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "ending_before", values = endingBefore?.let { listOf(it.toString()) }.orEmpty()))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "starting_after", values = startingAfter?.let { listOf(it.toString()) }.orEmpty()))
  }), PaymentMethodConfigurationsCodecs.getPaymentMethodConfigurationsRequestCodecRegistry, GetPaymentMethodConfigurationsResponseDecoder, options)

  /**
   * <p>Retrieve payment method configuration</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param configuration Wire parameter `configuration`.
   * @param expand Specifies which fields in the response should be expanded.
   * @param options Execution options.
   */
  public suspend fun getPaymentMethodConfigurationsConfigurationWithResponse(
    request: JsonObject? = null,
    configuration: String,
    expand: List<String>? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetPaymentMethodConfigurationsConfigurationResponse> = executor.executeWithResponse<JsonObject?, GetPaymentMethodConfigurationsConfigurationResponse>(SdkExecutionRequest(getPaymentMethodConfigurationsConfigurationMetadata, baseUri, request, listOf(PaymentMethodConfigurationsCodecs.GETPAYMENTMETHODCONFIGURATIONSCONFIGURATION_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "configuration", values = listOf(configuration.toString())))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
  }), PaymentMethodConfigurationsCodecs.getPaymentMethodConfigurationsConfigurationRequestCodecRegistry, GetPaymentMethodConfigurationsConfigurationResponseDecoder, options)

  /**
   * <p>Creates a payment method configuration</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param options Execution options.
   */
  public suspend fun postPaymentMethodConfigurationsWithResponse(request: InlineV1PaymentMethodConfigurationsPostRequestFormX5719ba0d? = null, options: CallOptions = CallOptions()): SdkResponseResult<PostPaymentMethodConfigurationsResponse> = executor.executeWithResponse<InlineV1PaymentMethodConfigurationsPostRequestFormX5719ba0d?, PostPaymentMethodConfigurationsResponse>(SdkExecutionRequest(postPaymentMethodConfigurationsMetadata, baseUri, request, listOf(PaymentMethodConfigurationsCodecs.POSTPAYMENTMETHODCONFIGURATIONS_REQUEST_CODEC_ID), emptyList()), PaymentMethodConfigurationsCodecs.postPaymentMethodConfigurationsRequestCodecRegistry, PostPaymentMethodConfigurationsResponseDecoder, options)

  /**
   * <p>Update payment method configuration</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param configuration Wire parameter `configuration`.
   * @param options Execution options.
   */
  public suspend fun postPaymentMethodConfigurationsConfigurationWithResponse(
    request: InlineV1PaymentMethodConfigurationsPostRequestFormX71360f88? = null,
    configuration: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostPaymentMethodConfigurationsConfigurationResponse> = executor.executeWithResponse<InlineV1PaymentMethodConfigurationsPostRequestFormX71360f88?, PostPaymentMethodConfigurationsConfigurationResponse>(SdkExecutionRequest(postPaymentMethodConfigurationsConfigurationMetadata, baseUri, request, listOf(PaymentMethodConfigurationsCodecs.POSTPAYMENTMETHODCONFIGURATIONSCONFIGURATION_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "configuration", values = listOf(configuration.toString())))
  }), PaymentMethodConfigurationsCodecs.postPaymentMethodConfigurationsConfigurationRequestCodecRegistry, PostPaymentMethodConfigurationsConfigurationResponseDecoder, options)

  /**
   * Typed response alternatives for `GetPaymentMethodConfigurations`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface GetPaymentMethodConfigurationsResponse {
    public class SuccessJson(
      public val json: InlineV1PaymentMethodConfigurationsGetResponse200JsonX684ee732,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetPaymentMethodConfigurationsResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetPaymentMethodConfigurationsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetPaymentMethodConfigurationsResponse
  }

  private object GetPaymentMethodConfigurationsResponseDecoder : SdkResponseAlternativeDecoder<GetPaymentMethodConfigurationsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetPaymentMethodConfigurationsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetPaymentMethodConfigurationsResponse> = when {
      alternative.id == "GetPaymentMethodConfigurations.response.alternative0" -> SdkResponseDecodeResult(
        value = GetPaymentMethodConfigurationsResponse.SuccessJson(
          json = PaymentMethodConfigurationsCodecs.getPaymentMethodConfigurationsResponseCodecAlternative0Registry.select(listOf("GetPaymentMethodConfigurations.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetPaymentMethodConfigurations.response.alternative1" -> SdkResponseDecodeResult(
        value = GetPaymentMethodConfigurationsResponse.DefaultJson(
          json = PaymentMethodConfigurationsCodecs.getPaymentMethodConfigurationsResponseCodecAlternative1Registry.select(listOf("GetPaymentMethodConfigurations.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetPaymentMethodConfigurationsResponse = GetPaymentMethodConfigurationsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetPaymentMethodConfigurationsConfiguration`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface GetPaymentMethodConfigurationsConfigurationResponse {
    public class SuccessJson(
      public val json: PaymentMethodConfiguration,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetPaymentMethodConfigurationsConfigurationResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetPaymentMethodConfigurationsConfigurationResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetPaymentMethodConfigurationsConfigurationResponse
  }

  private object GetPaymentMethodConfigurationsConfigurationResponseDecoder : SdkResponseAlternativeDecoder<GetPaymentMethodConfigurationsConfigurationResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetPaymentMethodConfigurationsConfigurationResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetPaymentMethodConfigurationsConfigurationResponse> = when {
      alternative.id == "GetPaymentMethodConfigurationsConfiguration.response.alternative0" -> SdkResponseDecodeResult(
        value = GetPaymentMethodConfigurationsConfigurationResponse.SuccessJson(
          json = PaymentMethodConfigurationsCodecs.getPaymentMethodConfigurationsConfigurationResponseCodecAlternative0Registry.select(listOf("GetPaymentMethodConfigurationsConfiguration.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetPaymentMethodConfigurationsConfiguration.response.alternative1" -> SdkResponseDecodeResult(
        value = GetPaymentMethodConfigurationsConfigurationResponse.DefaultJson(
          json = PaymentMethodConfigurationsCodecs.getPaymentMethodConfigurationsConfigurationResponseCodecAlternative1Registry.select(listOf("GetPaymentMethodConfigurationsConfiguration.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetPaymentMethodConfigurationsConfigurationResponse = GetPaymentMethodConfigurationsConfigurationResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostPaymentMethodConfigurations`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface PostPaymentMethodConfigurationsResponse {
    public class SuccessJson(
      public val json: PaymentMethodConfiguration,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostPaymentMethodConfigurationsResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostPaymentMethodConfigurationsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostPaymentMethodConfigurationsResponse
  }

  private object PostPaymentMethodConfigurationsResponseDecoder : SdkResponseAlternativeDecoder<PostPaymentMethodConfigurationsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostPaymentMethodConfigurationsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostPaymentMethodConfigurationsResponse> = when {
      alternative.id == "PostPaymentMethodConfigurations.response.alternative0" -> SdkResponseDecodeResult(
        value = PostPaymentMethodConfigurationsResponse.SuccessJson(
          json = PaymentMethodConfigurationsCodecs.postPaymentMethodConfigurationsResponseCodecAlternative0Registry.select(listOf("PostPaymentMethodConfigurations.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostPaymentMethodConfigurations.response.alternative1" -> SdkResponseDecodeResult(
        value = PostPaymentMethodConfigurationsResponse.DefaultJson(
          json = PaymentMethodConfigurationsCodecs.postPaymentMethodConfigurationsResponseCodecAlternative1Registry.select(listOf("PostPaymentMethodConfigurations.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostPaymentMethodConfigurationsResponse = PostPaymentMethodConfigurationsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostPaymentMethodConfigurationsConfiguration`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface PostPaymentMethodConfigurationsConfigurationResponse {
    public class SuccessJson(
      public val json: PaymentMethodConfiguration,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostPaymentMethodConfigurationsConfigurationResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostPaymentMethodConfigurationsConfigurationResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostPaymentMethodConfigurationsConfigurationResponse
  }

  private object PostPaymentMethodConfigurationsConfigurationResponseDecoder : SdkResponseAlternativeDecoder<PostPaymentMethodConfigurationsConfigurationResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostPaymentMethodConfigurationsConfigurationResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostPaymentMethodConfigurationsConfigurationResponse> = when {
      alternative.id == "PostPaymentMethodConfigurationsConfiguration.response.alternative0" -> SdkResponseDecodeResult(
        value = PostPaymentMethodConfigurationsConfigurationResponse.SuccessJson(
          json = PaymentMethodConfigurationsCodecs.postPaymentMethodConfigurationsConfigurationResponseCodecAlternative0Registry.select(listOf("PostPaymentMethodConfigurationsConfiguration.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostPaymentMethodConfigurationsConfiguration.response.alternative1" -> SdkResponseDecodeResult(
        value = PostPaymentMethodConfigurationsConfigurationResponse.DefaultJson(
          json = PaymentMethodConfigurationsCodecs.postPaymentMethodConfigurationsConfigurationResponseCodecAlternative1Registry.select(listOf("PostPaymentMethodConfigurationsConfiguration.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostPaymentMethodConfigurationsConfigurationResponse = PostPaymentMethodConfigurationsConfigurationResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    internal val getPaymentMethodConfigurationsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetPaymentMethodConfigurations",
          method = "GET",
          path = "/v1/payment_method_configurations",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1PaymentMethodConfigurationsGetResponse200JsonX684ee732",
              mode = SdkResponseMode.BUFFERED,
              id = "GetPaymentMethodConfigurations.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetPaymentMethodConfigurations.response.alternative1",
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

    internal val getPaymentMethodConfigurationsConfigurationMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetPaymentMethodConfigurationsConfiguration",
          method = "GET",
          path = "/v1/payment_method_configurations/{configuration}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "PaymentMethodConfiguration",
              mode = SdkResponseMode.BUFFERED,
              id = "GetPaymentMethodConfigurationsConfiguration.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetPaymentMethodConfigurationsConfiguration.response.alternative1",
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

    internal val postPaymentMethodConfigurationsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostPaymentMethodConfigurations",
          method = "POST",
          path = "/v1/payment_method_configurations",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "PaymentMethodConfiguration",
              mode = SdkResponseMode.BUFFERED,
              id = "PostPaymentMethodConfigurations.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostPaymentMethodConfigurations.response.alternative1",
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

    internal val postPaymentMethodConfigurationsConfigurationMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostPaymentMethodConfigurationsConfiguration",
          method = "POST",
          path = "/v1/payment_method_configurations/{configuration}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "PaymentMethodConfiguration",
              mode = SdkResponseMode.BUFFERED,
              id = "PostPaymentMethodConfigurationsConfiguration.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostPaymentMethodConfigurationsConfiguration.response.alternative1",
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
