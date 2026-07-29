package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.Int
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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-marketplace-purchase-changed/properties/previous_marketplace
 * _purchase/properties/plan.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-marketplace-purchase-changed/properties/previous_marketplace
 * _purchase/properties/plan
 */
@Serializable(with = InlineWebhookMarketplacePurchaseChangedPreviousMarketplacePurchasePlanX0a1a4402.Serializer::class)
public class InlineWebhookMarketplacePurchaseChangedPreviousMarketplacePurchasePlanX0a1a4402(
  bullets: List<String>,
  public val description: String,
  public val hasFreeTrial: Boolean,
  public val id: Int,
  public val monthlyPriceInCents: Int,
  public val name: String,
  public val priceModel:
      InlineWebhookMarketplacePu9c52PreviousMarketplaceP9633PlanPriceModelX30a2bb11,
  public val unitName: String?,
  public val yearlyPriceInCents: Int,
) {
  public val bullets: List<String> = bullets.toList()

  public class Builder {
    private var bulletsValue: List<String>? = null

    public var bullets: List<String>
      get() = requireNotNull(bulletsValue) { "bullets is required" }.toList()
      set(`value`) {
        bulletsValue = value.toList()
      }

    private var descriptionValue: String? = null

    public var description: String
      get() = requireNotNull(descriptionValue) { "description is required" }
      set(`value`) {
        descriptionValue = value
      }

    private var hasFreeTrialValue: Boolean? = null

    public var hasFreeTrial: Boolean
      get() = requireNotNull(hasFreeTrialValue) { "hasFreeTrial is required" }
      set(`value`) {
        hasFreeTrialValue = value
      }

    private var idValue: Int? = null

    public var id: Int
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var monthlyPriceInCentsValue: Int? = null

    public var monthlyPriceInCents: Int
      get() = requireNotNull(monthlyPriceInCentsValue) { "monthlyPriceInCents is required" }
      set(`value`) {
        monthlyPriceInCentsValue = value
      }

    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    private var priceModelValue:
        InlineWebhookMarketplacePu9c52PreviousMarketplaceP9633PlanPriceModelX30a2bb11? = null

    public var priceModel:
        InlineWebhookMarketplacePu9c52PreviousMarketplaceP9633PlanPriceModelX30a2bb11
      get() = requireNotNull(priceModelValue) { "priceModel is required" }
      set(`value`) {
        priceModelValue = value
      }

    private var yearlyPriceInCentsValue: Int? = null

    public var yearlyPriceInCents: Int
      get() = requireNotNull(yearlyPriceInCentsValue) { "yearlyPriceInCents is required" }
      set(`value`) {
        yearlyPriceInCentsValue = value
      }

    private var unitNameState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var unitName: String?
      get() = unitNameState.valueOrNull()
      set(`value`) {
        unitNameState = value.toNullableFieldState()
      }

    public fun build(): InlineWebhookMarketplacePurchaseChangedPreviousMarketplacePurchasePlanX0a1a4402 {
      check(bulletsValue != null) { "bullets is required" }
      check(descriptionValue != null) { "description is required" }
      check(hasFreeTrialValue != null) { "hasFreeTrial is required" }
      check(idValue != null) { "id is required" }
      check(monthlyPriceInCentsValue != null) { "monthlyPriceInCents is required" }
      check(nameValue != null) { "name is required" }
      check(priceModelValue != null) { "priceModel is required" }
      check(yearlyPriceInCentsValue != null) { "yearlyPriceInCents is required" }
      check(unitNameState !== FieldState.Absent) { "unitName is required, even when null" }
      return InlineWebhookMarketplacePurchaseChangedPreviousMarketplacePurchasePlanX0a1a4402(
        bullets = bullets,
        description = description,
        hasFreeTrial = hasFreeTrial,
        id = id,
        monthlyPriceInCents = monthlyPriceInCents,
        name = name,
        priceModel = priceModel,
        unitName = unitNameState.valueOrNull(),
        yearlyPriceInCents = yearlyPriceInCents,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookMarketplacePurchaseChangedPreviousMarketplacePurchasePlanX0a1a4402 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookMarketplacePurchaseChangedPreviousMarketplacePurchasePlanX0a1a4402> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookMarketplacePurchaseChangedPreviousMarketplacePurchasePlanX0a1a4402 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookMarketplacePurchaseChangedPreviousMarketplacePurchasePlanX0a1a4402")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookMarketplacePurchaseChangedPreviousMarketplacePurchasePlanX0a1a4402 must be a JSON object")
      val bullets = json.decodeRequired<List<String>>(rawObject, "bullets")
      val description = json.decodeRequired<String>(rawObject, "description")
      val hasFreeTrial = json.decodeRequired<Boolean>(rawObject, "has_free_trial")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val monthlyPriceInCents = json.decodeRequired<Int>(rawObject, "monthly_price_in_cents")
      val name = json.decodeRequired<String>(rawObject, "name")
      val priceModel = json.decodeRequired<InlineWebhookMarketplacePu9c52PreviousMarketplaceP9633PlanPriceModelX30a2bb11>(rawObject, "price_model")
      val yearlyPriceInCents = json.decodeRequired<Int>(rawObject, "yearly_price_in_cents")
      if (!rawObject.containsKey("unit_name")) {
        throw SerializationException("InlineWebhookMarketplacePurchaseChangedPreviousMarketplacePurchasePlanX0a1a4402 is missing required property 'unit_name'")
      }
      val unitName = rawObject["unit_name"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return InlineWebhookMarketplacePurchaseChangedPreviousMarketplacePurchasePlanX0a1a4402(
        bullets = bullets,
        description = description,
        hasFreeTrial = hasFreeTrial,
        id = id,
        monthlyPriceInCents = monthlyPriceInCents,
        name = name,
        priceModel = priceModel,
        unitName = unitName,
        yearlyPriceInCents = yearlyPriceInCents,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookMarketplacePurchaseChangedPreviousMarketplacePurchasePlanX0a1a4402) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookMarketplacePurchaseChangedPreviousMarketplacePurchasePlanX0a1a4402")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("bullets", json.encodeToJsonElement(value.bullets))
        put("description", value.description)
        put("has_free_trial", json.encodeToJsonElement(value.hasFreeTrial))
        put("id", json.encodeToJsonElement(value.id))
        put("monthly_price_in_cents", json.encodeToJsonElement(value.monthlyPriceInCents))
        put("name", value.name)
        put("price_model", json.encodeToJsonElement(value.priceModel))
        put("unit_name", value.unitName?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("yearly_price_in_cents", json.encodeToJsonElement(value.yearlyPriceInCents))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookMarketplacePurchaseChangedPreviousMarketplacePurchasePlanX0a1a4402(block: InlineWebhookMarketplacePurchaseChangedPreviousMarketplacePurchasePlanX0a1a4402.Builder.() -> Unit): InlineWebhookMarketplacePurchaseChangedPreviousMarketplacePurchasePlanX0a1a4402 = InlineWebhookMarketplacePurchaseChangedPreviousMarketplacePurchasePlanX0a1a4402.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookMarketplacePurchaseChangedPreviousMarketplacePurchasePlanX0a1a4402 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

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
    if (!nullable) throw SerializationException("InlineWebhookMarketplacePurchaseChangedPreviousMarketplacePurchasePlanX0a1a4402 property '" + name + "' is not nullable")
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
