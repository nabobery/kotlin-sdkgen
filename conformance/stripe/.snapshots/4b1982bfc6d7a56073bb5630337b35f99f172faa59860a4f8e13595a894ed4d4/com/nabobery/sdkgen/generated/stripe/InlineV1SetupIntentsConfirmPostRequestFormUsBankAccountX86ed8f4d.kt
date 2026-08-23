package com.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}~1confirm/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema/properties/payment_method_options/properties/us_bank_account.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}~1confirm/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema/properties/payment_method_options/properties/us_bank_account
 */
@Serializable(with = InlineV1SetupIntentsConfirmPostRequestFormUsBankAccountX86ed8f4d.Serializer::class)
public class InlineV1SetupIntentsConfirmPostRequestFormUsBankAccountX86ed8f4d(
  public val financialConnections:
      InlineV1SetupIntentsConfirmPostRequestFormFinancialConnectionsX4c04fb05? = null,
  public val mandateOptions:
      InlineV1SetupIntentsConfirmPostRequestFormMandateOptionsXc2d1d7fc? = null,
  public val networks:
      InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsNetworksX20a3349d? = null,
  public val verificationMethod:
      InlineV1SetupIntentsConfirmPostRequestFormVerificationMethodX64b1700d? = null,
) {
  public class Builder {
    public var financialConnections:
        InlineV1SetupIntentsConfirmPostRequestFormFinancialConnectionsX4c04fb05? = null

    public var mandateOptions: InlineV1SetupIntentsConfirmPostRequestFormMandateOptionsXc2d1d7fc? =
        null

    public var networks:
        InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsNetworksX20a3349d? = null

    public var verificationMethod:
        InlineV1SetupIntentsConfirmPostRequestFormVerificationMethodX64b1700d? = null

    public fun build(): InlineV1SetupIntentsConfirmPostRequestFormUsBankAccountX86ed8f4d = InlineV1SetupIntentsConfirmPostRequestFormUsBankAccountX86ed8f4d(
      financialConnections = financialConnections,
      mandateOptions = mandateOptions,
      networks = networks,
      verificationMethod = verificationMethod,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SetupIntentsConfirmPostRequestFormUsBankAccountX86ed8f4d = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1SetupIntentsConfirmPostRequestFormUsBankAccountX86ed8f4d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SetupIntentsConfirmPostRequestFormUsBankAccountX86ed8f4d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SetupIntentsConfirmPostRequestFormUsBankAccountX86ed8f4d")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SetupIntentsConfirmPostRequestFormUsBankAccountX86ed8f4d must be a JSON object")
      return InlineV1SetupIntentsConfirmPostRequestFormUsBankAccountX86ed8f4d(
        financialConnections = rawObject["financial_connections"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsConfirmPostRequestFormFinancialConnectionsX4c04fb05>(it) },
        mandateOptions = rawObject["mandate_options"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsConfirmPostRequestFormMandateOptionsXc2d1d7fc>(it) },
        networks = rawObject["networks"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsNetworksX20a3349d>(it) },
        verificationMethod = rawObject["verification_method"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsConfirmPostRequestFormVerificationMethodX64b1700d>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SetupIntentsConfirmPostRequestFormUsBankAccountX86ed8f4d) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SetupIntentsConfirmPostRequestFormUsBankAccountX86ed8f4d")
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

public fun inlineV1SetupIntentsConfirmPostRequestFormUsBankAccountX86ed8f4d(block: InlineV1SetupIntentsConfirmPostRequestFormUsBankAccountX86ed8f4d.Builder.() -> Unit): InlineV1SetupIntentsConfirmPostRequestFormUsBankAccountX86ed8f4d = InlineV1SetupIntentsConfirmPostRequestFormUsBankAccountX86ed8f4d.build(block)
