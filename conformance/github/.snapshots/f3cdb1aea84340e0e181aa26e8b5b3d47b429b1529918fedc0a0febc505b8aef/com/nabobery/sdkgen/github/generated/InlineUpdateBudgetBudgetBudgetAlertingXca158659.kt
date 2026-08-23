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
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/update-budget/properties/budget/properties/budget_alerting.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/update-budget/properties/budget/properties/budget_alerting
 */
@Serializable(with = InlineUpdateBudgetBudgetBudgetAlertingXca158659.Serializer::class)
public class InlineUpdateBudgetBudgetBudgetAlertingXca158659(
  alertRecipients: List<String>? = null,
  /**
   * Whether alerts are enabled for this budget
   */
  public val willAlert: Boolean? = null,
) {
  /**
   * Array of user login names who will receive alerts
   */
  public val alertRecipients: List<String>? =
      alertRecipients?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var alertRecipientsValue: List<String>? = null

    /**
     * Array of user login names who will receive alerts
     */
    public var alertRecipients: List<String>?
      get() = alertRecipientsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        alertRecipientsValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * Whether alerts are enabled for this budget
     */
    public var willAlert: Boolean? = null

    public fun build(): InlineUpdateBudgetBudgetBudgetAlertingXca158659 = InlineUpdateBudgetBudgetBudgetAlertingXca158659(
      alertRecipients = alertRecipients,
      willAlert = willAlert,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineUpdateBudgetBudgetBudgetAlertingXca158659 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineUpdateBudgetBudgetBudgetAlertingXca158659> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineUpdateBudgetBudgetBudgetAlertingXca158659 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineUpdateBudgetBudgetBudgetAlertingXca158659")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineUpdateBudgetBudgetBudgetAlertingXca158659 must be a JSON object")
      return InlineUpdateBudgetBudgetBudgetAlertingXca158659(
        alertRecipients = rawObject["alert_recipients"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        willAlert = rawObject["will_alert"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineUpdateBudgetBudgetBudgetAlertingXca158659) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineUpdateBudgetBudgetBudgetAlertingXca158659")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.alertRecipients?.let { put("alert_recipients", json.encodeToJsonElement(it)) }
        value.willAlert?.let { put("will_alert", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineUpdateBudgetBudgetBudgetAlertingXca158659(block: InlineUpdateBudgetBudgetBudgetAlertingXca158659.Builder.() -> Unit): InlineUpdateBudgetBudgetBudgetAlertingXca158659 = InlineUpdateBudgetBudgetBudgetAlertingXca158659.build(block)
