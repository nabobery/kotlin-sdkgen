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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhooks_marketplace_purchase/properties/plan.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhooks_marketplace_purchase/properties/plan
 */
@Serializable(with = InlineWebhooksMarketplacePurchasePlanX94dbce69.Serializer::class)
public class InlineWebhooksMarketplacePurchasePlanX94dbce69(
  bullets: List<String?>,
  public val description: String,
  public val hasFreeTrial: Boolean,
  public val id: Int,
  public val monthlyPriceInCents: Int,
  public val name: String,
  public val priceModel: InlineWebhooksMarketplacePurchasePlanPriceModelX5e273690,
  public val unitName: String?,
  public val yearlyPriceInCents: Int,
) {
  public val bullets: List<String?> = bullets.toList()

  public class Builder {
    private var bulletsValue: List<String?>? = null

    public var bullets: List<String?>
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

    private var priceModelValue: InlineWebhooksMarketplacePurchasePlanPriceModelX5e273690? = null

    public var priceModel: InlineWebhooksMarketplacePurchasePlanPriceModelX5e273690
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

    public fun build(): InlineWebhooksMarketplacePurchasePlanX94dbce69 {
      check(bulletsValue != null) { "bullets is required" }
      check(descriptionValue != null) { "description is required" }
      check(hasFreeTrialValue != null) { "hasFreeTrial is required" }
      check(idValue != null) { "id is required" }
      check(monthlyPriceInCentsValue != null) { "monthlyPriceInCents is required" }
      check(nameValue != null) { "name is required" }
      check(priceModelValue != null) { "priceModel is required" }
      check(yearlyPriceInCentsValue != null) { "yearlyPriceInCents is required" }
      check(unitNameState !== FieldState.Absent) { "unitName is required, even when null" }
      return InlineWebhooksMarketplacePurchasePlanX94dbce69(
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
    public fun build(block: Builder.() -> Unit): InlineWebhooksMarketplacePurchasePlanX94dbce69 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhooksMarketplacePurchasePlanX94dbce69> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhooksMarketplacePurchasePlanX94dbce69 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhooksMarketplacePurchasePlanX94dbce69")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhooksMarketplacePurchasePlanX94dbce69 must be a JSON object")
      val bullets = json.decodeRequired<List<String?>>(rawObject, "bullets")
      val description = json.decodeRequired<String>(rawObject, "description")
      val hasFreeTrial = json.decodeRequired<Boolean>(rawObject, "has_free_trial")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val monthlyPriceInCents = json.decodeRequired<Int>(rawObject, "monthly_price_in_cents")
      val name = json.decodeRequired<String>(rawObject, "name")
      val priceModel = json.decodeRequired<InlineWebhooksMarketplacePurchasePlanPriceModelX5e273690>(rawObject, "price_model")
      val yearlyPriceInCents = json.decodeRequired<Int>(rawObject, "yearly_price_in_cents")
      if (!rawObject.containsKey("unit_name")) {
        throw SerializationException("InlineWebhooksMarketplacePurchasePlanX94dbce69 is missing required property 'unit_name'")
      }
      val unitName = rawObject["unit_name"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return InlineWebhooksMarketplacePurchasePlanX94dbce69(
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

    override fun serialize(encoder: Encoder, `value`: InlineWebhooksMarketplacePurchasePlanX94dbce69) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhooksMarketplacePurchasePlanX94dbce69")
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

public fun inlineWebhooksMarketplacePurchasePlanX94dbce69(block: InlineWebhooksMarketplacePurchasePlanX94dbce69.Builder.() -> Unit): InlineWebhooksMarketplacePurchasePlanX94dbce69 = InlineWebhooksMarketplacePurchasePlanX94dbce69.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhooksMarketplacePurchasePlanX94dbce69 is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("InlineWebhooksMarketplacePurchasePlanX94dbce69 property '" + name + "' is not nullable")
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
