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
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/subscription_schedules_resource_default_settings_automatic_tax
 */
@Serializable(with = SubscriptionSchedulesResourceDefaultSettingsAutomaticTax.Serializer::class)
public class SubscriptionSchedulesResourceDefaultSettingsAutomaticTax(
  /**
   * Whether Stripe automatically computes tax on invoices created during this phase.
   */
  public val enabled: Boolean,
  /**
   * If Stripe disabled automatic tax, this enum describes why.
   */
  public val disabledReason: InlineSubscriptionSchedule62cfDisabledReasonXfef27da9? = null,
  /**
   * The account that's liable for tax. If set, the business address and tax registrations required to perform the tax
   * calculation are loaded from this account. The tax transaction is returned in the report of the connected account.
   */
  public val liability:
      InlineSubscriptionSchedulesResourceDefaultSettingsAutomaticTaxLiabilityXf82cd398? = null,
) {
  public class Builder {
    private var enabledValue: Boolean? = null

    public var enabled: Boolean
      get() = requireNotNull(enabledValue) { "enabled is required" }
      set(`value`) {
        enabledValue = value
      }

    /**
     * If Stripe disabled automatic tax, this enum describes why.
     */
    public var disabledReason: InlineSubscriptionSchedule62cfDisabledReasonXfef27da9? = null

    /**
     * The account that's liable for tax. If set, the business address and tax registrations required to perform the tax
     * calculation are loaded from this account. The tax transaction is returned in the report of the connected account.
     */
    public var liability:
        InlineSubscriptionSchedulesResourceDefaultSettingsAutomaticTaxLiabilityXf82cd398? = null

    public fun build(): SubscriptionSchedulesResourceDefaultSettingsAutomaticTax {
      check(enabledValue != null) { "enabled is required" }
      return SubscriptionSchedulesResourceDefaultSettingsAutomaticTax(
        enabled = enabled,
        disabledReason = disabledReason,
        liability = liability,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): SubscriptionSchedulesResourceDefaultSettingsAutomaticTax = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<SubscriptionSchedulesResourceDefaultSettingsAutomaticTax> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): SubscriptionSchedulesResourceDefaultSettingsAutomaticTax {
      val jsonDecoder = decoder.requireJsonDecoder("SubscriptionSchedulesResourceDefaultSettingsAutomaticTax")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("SubscriptionSchedulesResourceDefaultSettingsAutomaticTax must be a JSON object")
      val enabled = json.decodeRequired<Boolean>(rawObject, "enabled")
      return SubscriptionSchedulesResourceDefaultSettingsAutomaticTax(
        enabled = enabled,
        disabledReason = rawObject["disabled_reason"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineSubscriptionSchedule62cfDisabledReasonXfef27da9?>(element) },
        liability = rawObject["liability"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineSubscriptionSchedulesResourceDefaultSettingsAutomaticTaxLiabilityXf82cd398?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: SubscriptionSchedulesResourceDefaultSettingsAutomaticTax) {
      val jsonEncoder = encoder.requireJsonEncoder("SubscriptionSchedulesResourceDefaultSettingsAutomaticTax")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("enabled", json.encodeToJsonElement(value.enabled))
        value.disabledReason?.let { put("disabled_reason", json.encodeToJsonElement(it)) }
        value.liability?.let { put("liability", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun subscriptionSchedulesResourceDefaultSettingsAutomaticTax(block: SubscriptionSchedulesResourceDefaultSettingsAutomaticTax.Builder.() -> Unit): SubscriptionSchedulesResourceDefaultSettingsAutomaticTax = SubscriptionSchedulesResourceDefaultSettingsAutomaticTax.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("SubscriptionSchedulesResourceDefaultSettingsAutomaticTax is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
