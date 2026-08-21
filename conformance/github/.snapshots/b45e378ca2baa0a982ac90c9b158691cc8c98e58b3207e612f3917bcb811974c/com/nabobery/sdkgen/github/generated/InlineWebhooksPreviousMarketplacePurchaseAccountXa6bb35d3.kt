package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.Int
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
import kotlinx.serialization.json.JsonObjectBuilder
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/webhooks_previous_marketplace_purchase/properties/account.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhooks_previous_marketplace_purchase/properties/account
 */
@Serializable(with = InlineWebhooksPreviousMarketplacePurchaseAccountXa6bb35d3.Serializer::class)
public class InlineWebhooksPreviousMarketplacePurchaseAccountXa6bb35d3(
  public val id: Int,
  public val login: String,
  public val nodeId: String,
  public val organizationBillingEmail: String?,
  public val type: String,
) {
  public class Builder {
    private var idValue: Int? = null

    public var id: Int
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var loginValue: String? = null

    public var login: String
      get() = requireNotNull(loginValue) { "login is required" }
      set(`value`) {
        loginValue = value
      }

    private var nodeIdValue: String? = null

    public var nodeId: String
      get() = requireNotNull(nodeIdValue) { "nodeId is required" }
      set(`value`) {
        nodeIdValue = value
      }

    private var typeValue: String? = null

    public var type: String
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    private var organizationBillingEmailState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var organizationBillingEmail: String?
      get() = organizationBillingEmailState.valueOrNull()
      set(`value`) {
        organizationBillingEmailState = value.toNullableFieldState()
      }

    public fun build(): InlineWebhooksPreviousMarketplacePurchaseAccountXa6bb35d3 {
      check(idValue != null) { "id is required" }
      check(loginValue != null) { "login is required" }
      check(nodeIdValue != null) { "nodeId is required" }
      check(typeValue != null) { "type is required" }
      check(organizationBillingEmailState !== FieldState.Absent) { "organizationBillingEmail is required, even when null" }
      return InlineWebhooksPreviousMarketplacePurchaseAccountXa6bb35d3(
        id = id,
        login = login,
        nodeId = nodeId,
        organizationBillingEmail = organizationBillingEmailState.valueOrNull(),
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhooksPreviousMarketplacePurchaseAccountXa6bb35d3 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhooksPreviousMarketplacePurchaseAccountXa6bb35d3> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhooksPreviousMarketplacePurchaseAccountXa6bb35d3 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhooksPreviousMarketplacePurchaseAccountXa6bb35d3")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhooksPreviousMarketplacePurchaseAccountXa6bb35d3 must be a JSON object")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val login = json.decodeRequired<String>(rawObject, "login")
      val nodeId = json.decodeRequired<String>(rawObject, "node_id")
      val type = json.decodeRequired<String>(rawObject, "type")
      if (!rawObject.containsKey("organization_billing_email")) {
        throw SerializationException("InlineWebhooksPreviousMarketplacePurchaseAccountXa6bb35d3 is missing required property 'organization_billing_email'")
      }
      val organizationBillingEmail = rawObject["organization_billing_email"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return InlineWebhooksPreviousMarketplacePurchaseAccountXa6bb35d3(
        id = id,
        login = login,
        nodeId = nodeId,
        organizationBillingEmail = organizationBillingEmail,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhooksPreviousMarketplacePurchaseAccountXa6bb35d3) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhooksPreviousMarketplacePurchaseAccountXa6bb35d3")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("id", json.encodeToJsonElement(value.id))
        put("login", value.login)
        put("node_id", value.nodeId)
        put("organization_billing_email", value.organizationBillingEmail?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("type", value.type)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhooksPreviousMarketplacePurchaseAccountXa6bb35d3(block: InlineWebhooksPreviousMarketplacePurchaseAccountXa6bb35d3.Builder.() -> Unit): InlineWebhooksPreviousMarketplacePurchaseAccountXa6bb35d3 = InlineWebhooksPreviousMarketplacePurchaseAccountXa6bb35d3.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhooksPreviousMarketplacePurchaseAccountXa6bb35d3 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("InlineWebhooksPreviousMarketplacePurchaseAccountXa6bb35d3 property '" + name + "' is not nullable")
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
