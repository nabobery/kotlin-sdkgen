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
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonObjectBuilder
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1organizations~1{org}~1settings~1billing~1budgets~1{budget_id}/patch/requestBody
 * /content/application~1json/schema/properties/budget_alerting.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1organizations~1{org}~1settings~1billing~1budgets~1{budget_id}/patch/requestBody
 * /content/application~1json/schema/properties/budget_alerting
 */
@Serializable(with = InlineOrganizationsSettingsBillingBudgetsPatchRequestJsonBudgetAlertingX528d5893.Serializer::class)
public class InlineOrganizationsSettingsBillingBudgetsPatchRequestJsonBudgetAlertingX528d5893 internal constructor(
  alertRecipientsState: FieldState<List<String>>,
  private val willAlertState: FieldState<Boolean>,
) {
  private val alertRecipientsState: FieldState<List<String>> =
      alertRecipientsState.copyValue { fieldValue -> fieldValue.toList() }

  /**
   * Array of user login names who will receive alerts
   */
  public val alertRecipients: List<String>?
    get() = alertRecipientsState.valueOrNull()

  /**
   * Whether alerts are enabled for this budget
   */
  public val willAlert: Boolean?
    get() = willAlertState.valueOrNull()

  public constructor() : this(alertRecipientsState = FieldState.Absent,
  willAlertState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `alert_recipients`.
   */
  public fun alertRecipientsPresence(): FieldPresence = alertRecipientsState.presence

  /**
   * Returns the wire presence of `will_alert`.
   */
  public fun willAlertPresence(): FieldPresence = willAlertState.presence

  public class Builder {
    private var alertRecipientsState: FieldState<List<String>> = FieldState.Absent

    /**
     * Array of user login names who will receive alerts
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var alertRecipients: List<String>?
      get() = alertRecipientsState.valueOrNull()?.let { collection0 -> collection0.toList() }
      set(`value`) {
        val present = requireNotNull(value) { "alertRecipients is not nullable; call unsetAlertRecipients() to omit it" }
        alertRecipientsState = FieldState.Value(present.toList())
      }

    private var willAlertState: FieldState<Boolean> = FieldState.Absent

    /**
     * Whether alerts are enabled for this budget
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var willAlert: Boolean?
      get() = willAlertState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "willAlert is not nullable; call unsetWillAlert() to omit it" }
        willAlertState = FieldState.Value(present)
      }

    /**
     * Omits `alert_recipients` from serialized output.
     */
    public fun unsetAlertRecipients() {
      alertRecipientsState = FieldState.Absent
    }

    /**
     * Omits `will_alert` from serialized output.
     */
    public fun unsetWillAlert() {
      willAlertState = FieldState.Absent
    }

    public fun build(): InlineOrganizationsSettingsBillingBudgetsPatchRequestJsonBudgetAlertingX528d5893 = InlineOrganizationsSettingsBillingBudgetsPatchRequestJsonBudgetAlertingX528d5893(
      alertRecipientsState = alertRecipientsState,
      willAlertState = willAlertState,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrganizationsSettingsBillingBudgetsPatchRequestJsonBudgetAlertingX528d5893 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineOrganizationsSettingsBillingBudgetsPatchRequestJsonBudgetAlertingX528d5893> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrganizationsSettingsBillingBudgetsPatchRequestJsonBudgetAlertingX528d5893 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrganizationsSettingsBillingBudgetsPatchRequestJsonBudgetAlertingX528d5893")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrganizationsSettingsBillingBudgetsPatchRequestJsonBudgetAlertingX528d5893 must be a JSON object")
      return InlineOrganizationsSettingsBillingBudgetsPatchRequestJsonBudgetAlertingX528d5893(
        alertRecipientsState = json.decodeOptional(rawObject, "alert_recipients", nullable = false),
        willAlertState = json.decodeOptional(rawObject, "will_alert", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrganizationsSettingsBillingBudgetsPatchRequestJsonBudgetAlertingX528d5893) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrganizationsSettingsBillingBudgetsPatchRequestJsonBudgetAlertingX528d5893")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        putState("alert_recipients", value.alertRecipientsState, json::encodeToJsonElement)
        putState("will_alert", value.willAlertState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrganizationsSettingsBillingBudgetsPatchRequestJsonBudgetAlertingX528d5893(block: InlineOrganizationsSettingsBillingBudgetsPatchRequestJsonBudgetAlertingX528d5893.Builder.() -> Unit): InlineOrganizationsSettingsBillingBudgetsPatchRequestJsonBudgetAlertingX528d5893 = InlineOrganizationsSettingsBillingBudgetsPatchRequestJsonBudgetAlertingX528d5893.build(block)

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <T> FieldState<T>.copyValue(copy: (T) -> T): FieldState<T> = when (this) {
  FieldState.Absent -> this
  FieldState.Null -> this
  is FieldState.Value -> FieldState.Value(copy(value))
}

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("InlineOrganizationsSettingsBillingBudgetsPatchRequestJsonBudgetAlertingX528d5893 property '" + name + "' is not nullable")
    return FieldState.Null
  }
  return FieldState.Value(decodeFromJsonElement<T>(element))
}

private inline fun <T> JsonObjectBuilder.putState(
  name: String,
  state: FieldState<T>,
  encode: (T) -> JsonElement,
) {
  when (state) {
    FieldState.Absent -> Unit
    FieldState.Null -> put(name, JsonNull)
    is FieldState.Value -> put(name, encode(state.value))
  }
}
