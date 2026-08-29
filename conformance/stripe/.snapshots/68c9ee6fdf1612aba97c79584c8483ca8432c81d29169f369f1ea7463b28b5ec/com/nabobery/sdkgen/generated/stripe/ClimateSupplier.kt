package com.nabobery.sdkgen.generated.stripe

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
 * A supplier of carbon removal.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/climate.supplier
 */
@Serializable(with = ClimateSupplier.Serializer::class)
public class ClimateSupplier(
  /**
   * Unique identifier for the object.
   */
  public val id: String,
  /**
   * Link to a webpage to learn more about the supplier.
   */
  public val infoUrl: String,
  /**
   * Has the value `true` if the object exists in live mode or the value `false` if the object exists in test mode.
   */
  public val livemode: Boolean,
  locations: List<ClimateRemovalsLocation>,
  /**
   * Name of this carbon removal supplier.
   */
  public val name: String,
  /**
   * String representing the object’s type. Objects of the same type share the same value.
   */
  public val objectValue: InlineClimateSupplierObjectValueXe62fdd2b,
  /**
   * The scientific pathway used for carbon removal.
   */
  public val removalPathway: InlineClimateSupplierRemovalPathwayXc4cf9412,
) {
  /**
   * The locations in which this supplier operates.
   */
  public val locations: List<ClimateRemovalsLocation> = locations.toList()

  public class Builder {
    private var idValue: String? = null

    public var id: String
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var infoUrlValue: String? = null

    public var infoUrl: String
      get() = requireNotNull(infoUrlValue) { "infoUrl is required" }
      set(`value`) {
        infoUrlValue = value
      }

    private var livemodeValue: Boolean? = null

    public var livemode: Boolean
      get() = requireNotNull(livemodeValue) { "livemode is required" }
      set(`value`) {
        livemodeValue = value
      }

    private var locationsValue: List<ClimateRemovalsLocation>? = null

    public var locations: List<ClimateRemovalsLocation>
      get() = requireNotNull(locationsValue) { "locations is required" }.toList()
      set(`value`) {
        locationsValue = value.toList()
      }

    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    private var objectValueValue: InlineClimateSupplierObjectValueXe62fdd2b? = null

    public var objectValue: InlineClimateSupplierObjectValueXe62fdd2b
      get() = requireNotNull(objectValueValue) { "objectValue is required" }
      set(`value`) {
        objectValueValue = value
      }

    private var removalPathwayValue: InlineClimateSupplierRemovalPathwayXc4cf9412? = null

    public var removalPathway: InlineClimateSupplierRemovalPathwayXc4cf9412
      get() = requireNotNull(removalPathwayValue) { "removalPathway is required" }
      set(`value`) {
        removalPathwayValue = value
      }

    public fun build(): ClimateSupplier {
      check(idValue != null) { "id is required" }
      check(infoUrlValue != null) { "infoUrl is required" }
      check(livemodeValue != null) { "livemode is required" }
      check(locationsValue != null) { "locations is required" }
      check(nameValue != null) { "name is required" }
      check(objectValueValue != null) { "objectValue is required" }
      check(removalPathwayValue != null) { "removalPathway is required" }
      return ClimateSupplier(
        id = id,
        infoUrl = infoUrl,
        livemode = livemode,
        locations = locations,
        name = name,
        objectValue = objectValue,
        removalPathway = removalPathway,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ClimateSupplier = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ClimateSupplier> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ClimateSupplier {
      val jsonDecoder = decoder.requireJsonDecoder("ClimateSupplier")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ClimateSupplier must be a JSON object")
      val id = json.decodeRequired<String>(rawObject, "id")
      val infoUrl = json.decodeRequired<String>(rawObject, "info_url")
      val livemode = json.decodeRequired<Boolean>(rawObject, "livemode")
      val locations = json.decodeRequired<List<ClimateRemovalsLocation>>(rawObject, "locations")
      val name = json.decodeRequired<String>(rawObject, "name")
      val objectValue = json.decodeRequired<InlineClimateSupplierObjectValueXe62fdd2b>(rawObject, "object")
      val removalPathway = json.decodeRequired<InlineClimateSupplierRemovalPathwayXc4cf9412>(rawObject, "removal_pathway")
      return ClimateSupplier(
        id = id,
        infoUrl = infoUrl,
        livemode = livemode,
        locations = locations,
        name = name,
        objectValue = objectValue,
        removalPathway = removalPathway,
      )
    }

    override fun serialize(encoder: Encoder, `value`: ClimateSupplier) {
      val jsonEncoder = encoder.requireJsonEncoder("ClimateSupplier")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("id", value.id)
        put("info_url", value.infoUrl)
        put("livemode", json.encodeToJsonElement(value.livemode))
        put("locations", json.encodeToJsonElement(value.locations))
        put("name", value.name)
        put("object", json.encodeToJsonElement(value.objectValue))
        put("removal_pathway", json.encodeToJsonElement(value.removalPathway))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun climateSupplier(block: ClimateSupplier.Builder.() -> Unit): ClimateSupplier = ClimateSupplier.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ClimateSupplier is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
