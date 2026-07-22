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
 * sdkgen://source/openapi.yaml#/paths/~1organizations~1{org}~1settings~1billing~1budgets/post/requestBody/content/appli
 * cation~1json/schema/properties/budget_alerting.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1organizations~1{org}~1settings~1billing~1budgets/post/requestBody/content/appli
 * cation~1json/schema/properties/budget_alerting
 */
@Serializable(with = InlineOrganizationsSettingsBillingBudgetsPostRequestJsonBudgetAlertingX70b5b27f.Serializer::class)
public class InlineOrganizationsSettingsBillingBudgetsPostRequestJsonBudgetAlertingX70b5b27f(
  /**
   * Array of user login names who will receive alerts
   */
  public val alertRecipients: List<String>? = null,
  /**
   * Whether alerts are enabled for this budget
   */
  public val willAlert: Boolean? = null,
) {
  public class Builder {
    /**
     * Array of user login names who will receive alerts
     */
    public var alertRecipients: List<String>? = null

    /**
     * Whether alerts are enabled for this budget
     */
    public var willAlert: Boolean? = null

    public fun build(): InlineOrganizationsSettingsBillingBudgetsPostRequestJsonBudgetAlertingX70b5b27f = InlineOrganizationsSettingsBillingBudgetsPostRequestJsonBudgetAlertingX70b5b27f(
      alertRecipients = alertRecipients,
      willAlert = willAlert,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrganizationsSettingsBillingBudgetsPostRequestJsonBudgetAlertingX70b5b27f = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineOrganizationsSettingsBillingBudgetsPostRequestJsonBudgetAlertingX70b5b27f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrganizationsSettingsBillingBudgetsPostRequestJsonBudgetAlertingX70b5b27f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrganizationsSettingsBillingBudgetsPostRequestJsonBudgetAlertingX70b5b27f")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrganizationsSettingsBillingBudgetsPostRequestJsonBudgetAlertingX70b5b27f must be a JSON object")
      return InlineOrganizationsSettingsBillingBudgetsPostRequestJsonBudgetAlertingX70b5b27f(
        alertRecipients = rawObject["alert_recipients"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        willAlert = rawObject["will_alert"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrganizationsSettingsBillingBudgetsPostRequestJsonBudgetAlertingX70b5b27f) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrganizationsSettingsBillingBudgetsPostRequestJsonBudgetAlertingX70b5b27f")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.alertRecipients?.let { put("alert_recipients", json.encodeToJsonElement(it)) }
        value.willAlert?.let { put("will_alert", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrganizationsSettingsBillingBudgetsPostRequestJsonBudgetAlertingX70b5b27f(block: InlineOrganizationsSettingsBillingBudgetsPostRequestJsonBudgetAlertingX70b5b27f.Builder.() -> Unit): InlineOrganizationsSettingsBillingBudgetsPostRequestJsonBudgetAlertingX70b5b27f = InlineOrganizationsSettingsBillingBudgetsPostRequestJsonBudgetAlertingX70b5b27f.build(block)
