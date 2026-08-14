package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}/post/requestBody/content/application~1x-www-form-ur
 * lencoded/schema/properties/payment_method_options/properties/us_bank_account.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}/post/requestBody/content/application~1x-www-form-ur
 * lencoded/schema/properties/payment_method_options/properties/us_bank_account
 */
@Serializable(with = InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsUsBankAccountX8e1d683a.Serializer::class)
public class InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsUsBankAccountX8e1d683a(
  public val financialConnections:
      InlineV1SetupIntentsPostRequestFormFinancialConnectionsXd703e5a4? = null,
  public val mandateOptions:
      InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXd8dc8e1b? = null,
  public val networks:
      InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsNetworksX91136686? = null,
  public val verificationMethod:
      InlineV1SetupIntentsPostRequestFormVerificationMethodX840f64b3? = null,
) {
  public class Builder {
    public var financialConnections:
        InlineV1SetupIntentsPostRequestFormFinancialConnectionsXd703e5a4? = null

    public var mandateOptions:
        InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXd8dc8e1b? = null

    public var networks: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsNetworksX91136686? =
        null

    public var verificationMethod: InlineV1SetupIntentsPostRequestFormVerificationMethodX840f64b3? =
        null

    public fun build(): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsUsBankAccountX8e1d683a = InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsUsBankAccountX8e1d683a(
      financialConnections = financialConnections,
      mandateOptions = mandateOptions,
      networks = networks,
      verificationMethod = verificationMethod,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsUsBankAccountX8e1d683a = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsUsBankAccountX8e1d683a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsUsBankAccountX8e1d683a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsUsBankAccountX8e1d683a")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsUsBankAccountX8e1d683a must be a JSON object")
      return InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsUsBankAccountX8e1d683a(
        financialConnections = rawObject["financial_connections"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormFinancialConnectionsXd703e5a4>(it) },
        mandateOptions = rawObject["mandate_options"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXd8dc8e1b>(it) },
        networks = rawObject["networks"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsNetworksX91136686>(it) },
        verificationMethod = rawObject["verification_method"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormVerificationMethodX840f64b3>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsUsBankAccountX8e1d683a) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsUsBankAccountX8e1d683a")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.financialConnections?.let { put("financial_connections", json.encodeToJsonElement(it)) }
        value.mandateOptions?.let { put("mandate_options", json.encodeToJsonElement(it)) }
        value.networks?.let { put("networks", json.encodeToJsonElement(it)) }
        value.verificationMethod?.let { put("verification_method", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1SetupIntentsPostRequestFormPaymentMethodOptionsUsBankAccountX8e1d683a(block: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsUsBankAccountX8e1d683a.Builder.() -> Unit): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsUsBankAccountX8e1d683a = InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsUsBankAccountX8e1d683a.build(block)
