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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * The `tier_changed` and `pending_tier_change` will include the original tier before the change or pending change. For
 * more information, see the pending tier change payload.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhooks_sponsorship/properties/tier
 */
@Serializable(with = InlineWebhooksSponsorshipTierXaa6d63aa.Serializer::class)
public class InlineWebhooksSponsorshipTierXaa6d63aa(
  public val createdAt: String,
  public val description: String,
  public val isOneTime: Boolean,
  public val monthlyPriceInCents: Int,
  public val monthlyPriceInDollars: Int,
  public val name: String,
  public val nodeId: String,
  public val isCustomAmmount: Boolean? = null,
  public val isCustomAmount: Boolean? = null,
) {
  public class Builder {
    private var createdAtValue: String? = null

    public var createdAt: String
      get() = requireNotNull(createdAtValue) { "createdAt is required" }
      set(`value`) {
        createdAtValue = value
      }

    private var descriptionValue: String? = null

    public var description: String
      get() = requireNotNull(descriptionValue) { "description is required" }
      set(`value`) {
        descriptionValue = value
      }

    private var isOneTimeValue: Boolean? = null

    public var isOneTime: Boolean
      get() = requireNotNull(isOneTimeValue) { "isOneTime is required" }
      set(`value`) {
        isOneTimeValue = value
      }

    private var monthlyPriceInCentsValue: Int? = null

    public var monthlyPriceInCents: Int
      get() = requireNotNull(monthlyPriceInCentsValue) { "monthlyPriceInCents is required" }
      set(`value`) {
        monthlyPriceInCentsValue = value
      }

    private var monthlyPriceInDollarsValue: Int? = null

    public var monthlyPriceInDollars: Int
      get() = requireNotNull(monthlyPriceInDollarsValue) { "monthlyPriceInDollars is required" }
      set(`value`) {
        monthlyPriceInDollarsValue = value
      }

    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    private var nodeIdValue: String? = null

    public var nodeId: String
      get() = requireNotNull(nodeIdValue) { "nodeId is required" }
      set(`value`) {
        nodeIdValue = value
      }

    public var isCustomAmmount: Boolean? = null

    public var isCustomAmount: Boolean? = null

    public fun build(): InlineWebhooksSponsorshipTierXaa6d63aa {
      check(createdAtValue != null) { "createdAt is required" }
      check(descriptionValue != null) { "description is required" }
      check(isOneTimeValue != null) { "isOneTime is required" }
      check(monthlyPriceInCentsValue != null) { "monthlyPriceInCents is required" }
      check(monthlyPriceInDollarsValue != null) { "monthlyPriceInDollars is required" }
      check(nameValue != null) { "name is required" }
      check(nodeIdValue != null) { "nodeId is required" }
      return InlineWebhooksSponsorshipTierXaa6d63aa(
        createdAt = createdAt,
        description = description,
        isOneTime = isOneTime,
        monthlyPriceInCents = monthlyPriceInCents,
        monthlyPriceInDollars = monthlyPriceInDollars,
        name = name,
        nodeId = nodeId,
        isCustomAmmount = isCustomAmmount,
        isCustomAmount = isCustomAmount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhooksSponsorshipTierXaa6d63aa = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhooksSponsorshipTierXaa6d63aa> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhooksSponsorshipTierXaa6d63aa {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhooksSponsorshipTierXaa6d63aa")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhooksSponsorshipTierXaa6d63aa must be a JSON object")
      val createdAt = json.decodeRequired<String>(rawObject, "created_at")
      val description = json.decodeRequired<String>(rawObject, "description")
      val isOneTime = json.decodeRequired<Boolean>(rawObject, "is_one_time")
      val monthlyPriceInCents = json.decodeRequired<Int>(rawObject, "monthly_price_in_cents")
      val monthlyPriceInDollars = json.decodeRequired<Int>(rawObject, "monthly_price_in_dollars")
      val name = json.decodeRequired<String>(rawObject, "name")
      val nodeId = json.decodeRequired<String>(rawObject, "node_id")
      return InlineWebhooksSponsorshipTierXaa6d63aa(
        createdAt = createdAt,
        description = description,
        isOneTime = isOneTime,
        monthlyPriceInCents = monthlyPriceInCents,
        monthlyPriceInDollars = monthlyPriceInDollars,
        name = name,
        nodeId = nodeId,
        isCustomAmmount = rawObject["is_custom_ammount"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        isCustomAmount = rawObject["is_custom_amount"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhooksSponsorshipTierXaa6d63aa) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhooksSponsorshipTierXaa6d63aa")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("created_at", value.createdAt)
        put("description", value.description)
        put("is_one_time", json.encodeToJsonElement(value.isOneTime))
        put("monthly_price_in_cents", json.encodeToJsonElement(value.monthlyPriceInCents))
        put("monthly_price_in_dollars", json.encodeToJsonElement(value.monthlyPriceInDollars))
        put("name", value.name)
        put("node_id", value.nodeId)
        value.isCustomAmmount?.let { put("is_custom_ammount", json.encodeToJsonElement(it)) }
        value.isCustomAmount?.let { put("is_custom_amount", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhooksSponsorshipTierXaa6d63aa(block: InlineWebhooksSponsorshipTierXaa6d63aa.Builder.() -> Unit): InlineWebhooksSponsorshipTierXaa6d63aa = InlineWebhooksSponsorshipTierXaa6d63aa.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhooksSponsorshipTierXaa6d63aa is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
