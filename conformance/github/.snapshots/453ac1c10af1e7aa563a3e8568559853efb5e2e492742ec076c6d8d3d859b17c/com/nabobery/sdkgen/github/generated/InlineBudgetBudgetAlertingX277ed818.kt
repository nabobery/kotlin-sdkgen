package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/budget/properties/budget_alerting.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/budget/properties/budget_alerting
 */
@Serializable(with = InlineBudgetBudgetAlertingX277ed818.Serializer::class)
public class InlineBudgetBudgetAlertingX277ed818(
  alertRecipients: List<String>,
  /**
   * Whether alerts are enabled for this budget
   */
  public val willAlert: Boolean,
) {
  /**
   * Array of user login names who will receive alerts
   */
  public val alertRecipients: List<String> = alertRecipients.toList()

  public class Builder {
    private var alertRecipientsValue: List<String>? = null

    public var alertRecipients: List<String>
      get() = requireNotNull(alertRecipientsValue) { "alertRecipients is required" }.toList()
      set(`value`) {
        alertRecipientsValue = value.toList()
      }

    private var willAlertValue: Boolean? = null

    public var willAlert: Boolean
      get() = requireNotNull(willAlertValue) { "willAlert is required" }
      set(`value`) {
        willAlertValue = value
      }

    public fun build(): InlineBudgetBudgetAlertingX277ed818 {
      check(alertRecipientsValue != null) { "alertRecipients is required" }
      check(willAlertValue != null) { "willAlert is required" }
      return InlineBudgetBudgetAlertingX277ed818(
        alertRecipients = alertRecipients,
        willAlert = willAlert,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineBudgetBudgetAlertingX277ed818 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineBudgetBudgetAlertingX277ed818> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineBudgetBudgetAlertingX277ed818 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineBudgetBudgetAlertingX277ed818")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineBudgetBudgetAlertingX277ed818 must be a JSON object")
      val alertRecipients = json.decodeRequired<List<String>>(rawObject, "alert_recipients")
      val willAlert = json.decodeRequired<Boolean>(rawObject, "will_alert")
      return InlineBudgetBudgetAlertingX277ed818(
        alertRecipients = alertRecipients,
        willAlert = willAlert,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineBudgetBudgetAlertingX277ed818) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineBudgetBudgetAlertingX277ed818")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("alert_recipients", json.encodeToJsonElement(value.alertRecipients))
        put("will_alert", json.encodeToJsonElement(value.willAlert))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineBudgetBudgetAlertingX277ed818(block: InlineBudgetBudgetAlertingX277ed818.Builder.() -> Unit): InlineBudgetBudgetAlertingX277ed818 = InlineBudgetBudgetAlertingX277ed818.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineBudgetBudgetAlertingX277ed818 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
