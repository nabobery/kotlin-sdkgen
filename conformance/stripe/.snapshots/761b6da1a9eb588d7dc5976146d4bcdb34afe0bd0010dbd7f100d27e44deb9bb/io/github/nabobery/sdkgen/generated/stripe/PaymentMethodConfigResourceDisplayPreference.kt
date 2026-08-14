package io.github.nabobery.sdkgen.generated.stripe

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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_config_resource_display_preference
 */
@Serializable(with = PaymentMethodConfigResourceDisplayPreference.Serializer::class)
public class PaymentMethodConfigResourceDisplayPreference(
  /**
   * The account's display preference.
   */
  public val preference: InlinePaymentMethodConfigResourceDisplayPreferencePreferenceX8d28a137,
  /**
   * The effective display preference value.
   */
  public val `value`: InlinePaymentMethodConfigResourceDisplayPreferenceValueX26477268,
  /**
   * For child configs, whether or not the account's preference will be observed. If `false`, the parent configuration's
   * default is used.
   */
  public val overridable: Boolean? = null,
) {
  public class Builder {
    private var preferenceValue:
        InlinePaymentMethodConfigResourceDisplayPreferencePreferenceX8d28a137? = null

    public var preference: InlinePaymentMethodConfigResourceDisplayPreferencePreferenceX8d28a137
      get() = requireNotNull(preferenceValue) { "preference is required" }
      set(`value`) {
        preferenceValue = value
      }

    private var valueValue: InlinePaymentMethodConfigResourceDisplayPreferenceValueX26477268? = null

    public var `value`: InlinePaymentMethodConfigResourceDisplayPreferenceValueX26477268
      get() = requireNotNull(valueValue) { "value is required" }
      set(`value`) {
        valueValue = value
      }

    /**
     * For child configs, whether or not the account's preference will be observed. If `false`, the parent
     * configuration's default is used.
     */
    public var overridable: Boolean? = null

    public fun build(): PaymentMethodConfigResourceDisplayPreference {
      check(preferenceValue != null) { "preference is required" }
      check(valueValue != null) { "value is required" }
      return PaymentMethodConfigResourceDisplayPreference(
        preference = preference,
        value = value,
        overridable = overridable,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentMethodConfigResourceDisplayPreference = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PaymentMethodConfigResourceDisplayPreference> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentMethodConfigResourceDisplayPreference {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentMethodConfigResourceDisplayPreference")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentMethodConfigResourceDisplayPreference must be a JSON object")
      val preference = json.decodeRequired<InlinePaymentMethodConfigResourceDisplayPreferencePreferenceX8d28a137>(rawObject, "preference")
      val value = json.decodeRequired<InlinePaymentMethodConfigResourceDisplayPreferenceValueX26477268>(rawObject, "value")
      return PaymentMethodConfigResourceDisplayPreference(
        preference = preference,
        value = value,
        overridable = rawObject["overridable"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Boolean?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentMethodConfigResourceDisplayPreference) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentMethodConfigResourceDisplayPreference")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("preference", json.encodeToJsonElement(value.preference))
        put("value", json.encodeToJsonElement(value.value))
        value.overridable?.let { put("overridable", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentMethodConfigResourceDisplayPreference(block: PaymentMethodConfigResourceDisplayPreference.Builder.() -> Unit): PaymentMethodConfigResourceDisplayPreference = PaymentMethodConfigResourceDisplayPreference.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PaymentMethodConfigResourceDisplayPreference is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
