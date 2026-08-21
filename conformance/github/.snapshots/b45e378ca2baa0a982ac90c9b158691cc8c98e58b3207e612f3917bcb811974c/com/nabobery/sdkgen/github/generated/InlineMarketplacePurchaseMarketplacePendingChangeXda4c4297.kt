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
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/marketplace-purchase/properties/marketplace_pending_change.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/marketplace-purchase/properties/marketplace_pending_change
 */
@Serializable(with = InlineMarketplacePurchaseMarketplacePendingChangeXda4c4297.Serializer::class)
public class InlineMarketplacePurchaseMarketplacePendingChangeXda4c4297(
  public val effectiveDate: String? = null,
  public val id: Int? = null,
  public val isInstalled: Boolean? = null,
  public val plan: MarketplaceListingPlan? = null,
  public val unitCount: Int? = null,
) {
  public class Builder {
    public var effectiveDate: String? = null

    public var id: Int? = null

    public var isInstalled: Boolean? = null

    public var plan: MarketplaceListingPlan? = null

    public var unitCount: Int? = null

    public fun build(): InlineMarketplacePurchaseMarketplacePendingChangeXda4c4297 = InlineMarketplacePurchaseMarketplacePendingChangeXda4c4297(
      effectiveDate = effectiveDate,
      id = id,
      isInstalled = isInstalled,
      plan = plan,
      unitCount = unitCount,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineMarketplacePurchaseMarketplacePendingChangeXda4c4297 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineMarketplacePurchaseMarketplacePendingChangeXda4c4297> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineMarketplacePurchaseMarketplacePendingChangeXda4c4297 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineMarketplacePurchaseMarketplacePendingChangeXda4c4297")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineMarketplacePurchaseMarketplacePendingChangeXda4c4297 must be a JSON object")
      return InlineMarketplacePurchaseMarketplacePendingChangeXda4c4297(
        effectiveDate = rawObject["effective_date"]?.let { json.decodeFromJsonElement<String>(it) },
        id = rawObject["id"]?.let { json.decodeFromJsonElement<Int>(it) },
        isInstalled = rawObject["is_installed"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        plan = rawObject["plan"]?.let { json.decodeFromJsonElement<MarketplaceListingPlan>(it) },
        unitCount = rawObject["unit_count"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineMarketplacePurchaseMarketplacePendingChangeXda4c4297) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineMarketplacePurchaseMarketplacePendingChangeXda4c4297")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.effectiveDate?.let { put("effective_date", it) }
        value.id?.let { put("id", json.encodeToJsonElement(it)) }
        value.isInstalled?.let { put("is_installed", json.encodeToJsonElement(it)) }
        value.plan?.let { put("plan", json.encodeToJsonElement(it)) }
        value.unitCount?.let { put("unit_count", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineMarketplacePurchaseMarketplacePendingChangeXda4c4297(block: InlineMarketplacePurchaseMarketplacePendingChangeXda4c4297.Builder.() -> Unit): InlineMarketplacePurchaseMarketplacePendingChangeXda4c4297 = InlineMarketplacePurchaseMarketplacePendingChangeXda4c4297.build(block)
