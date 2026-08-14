package io.github.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/components/schemas/create-budget/properties/budget/properties/budget_alerting.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/create-budget/properties/budget/properties/budget_alerting
 */
@Serializable(with = InlineCreateBudgetBudgetBudgetAlertingXe18cb9ab.Serializer::class)
public class InlineCreateBudgetBudgetBudgetAlertingXe18cb9ab(
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

    public fun build(): InlineCreateBudgetBudgetBudgetAlertingXe18cb9ab = InlineCreateBudgetBudgetBudgetAlertingXe18cb9ab(
      alertRecipients = alertRecipients,
      willAlert = willAlert,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineCreateBudgetBudgetBudgetAlertingXe18cb9ab = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineCreateBudgetBudgetBudgetAlertingXe18cb9ab> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineCreateBudgetBudgetBudgetAlertingXe18cb9ab {
      val jsonDecoder = decoder.requireJsonDecoder("InlineCreateBudgetBudgetBudgetAlertingXe18cb9ab")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineCreateBudgetBudgetBudgetAlertingXe18cb9ab must be a JSON object")
      return InlineCreateBudgetBudgetBudgetAlertingXe18cb9ab(
        alertRecipients = rawObject["alert_recipients"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        willAlert = rawObject["will_alert"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineCreateBudgetBudgetBudgetAlertingXe18cb9ab) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineCreateBudgetBudgetBudgetAlertingXe18cb9ab")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.alertRecipients?.let { put("alert_recipients", json.encodeToJsonElement(it)) }
        value.willAlert?.let { put("will_alert", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineCreateBudgetBudgetBudgetAlertingXe18cb9ab(block: InlineCreateBudgetBudgetBudgetAlertingXe18cb9ab.Builder.() -> Unit): InlineCreateBudgetBudgetBudgetAlertingXe18cb9ab = InlineCreateBudgetBudgetBudgetAlertingXe18cb9ab.build(block)
