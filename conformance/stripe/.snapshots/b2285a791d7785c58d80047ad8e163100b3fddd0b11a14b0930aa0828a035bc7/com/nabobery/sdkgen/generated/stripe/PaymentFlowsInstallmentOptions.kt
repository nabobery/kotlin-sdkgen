package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_flows_installment_options
 */
@Serializable(with = PaymentFlowsInstallmentOptions.Serializer::class)
public class PaymentFlowsInstallmentOptions(
  public val enabled: Boolean,
  public val plan: PaymentMethodDetailsCardInstallmentsPlan? = null,
) {
  public class Builder {
    private var enabledValue: Boolean? = null

    public var enabled: Boolean
      get() = requireNotNull(enabledValue) { "enabled is required" }
      set(`value`) {
        enabledValue = value
      }

    public var plan: PaymentMethodDetailsCardInstallmentsPlan? = null

    public fun build(): PaymentFlowsInstallmentOptions {
      check(enabledValue != null) { "enabled is required" }
      return PaymentFlowsInstallmentOptions(
        enabled = enabled,
        plan = plan,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentFlowsInstallmentOptions = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<PaymentFlowsInstallmentOptions> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentFlowsInstallmentOptions {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentFlowsInstallmentOptions")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentFlowsInstallmentOptions must be a JSON object")
      val enabled = json.decodeRequired<Boolean>(rawObject, "enabled")
      return PaymentFlowsInstallmentOptions(
        enabled = enabled,
        plan = rawObject["plan"]?.let { json.decodeFromJsonElement<PaymentMethodDetailsCardInstallmentsPlan>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentFlowsInstallmentOptions) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentFlowsInstallmentOptions")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("enabled", json.encodeToJsonElement(value.enabled))
        value.plan?.let { put("plan", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentFlowsInstallmentOptions(block: PaymentFlowsInstallmentOptions.Builder.() -> Unit): PaymentFlowsInstallmentOptions = PaymentFlowsInstallmentOptions.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PaymentFlowsInstallmentOptions is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
