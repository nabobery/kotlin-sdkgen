package io.github.nabobery.sdkgen.generated.stripe

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
 * List of items contained within this value list.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/radar.value_list/properties/list_items
 */
@Serializable(with = InlineRadarValueListListItemsXd336042d.Serializer::class)
public class InlineRadarValueListListItemsXd336042d(
  `data`: List<RadarValueListItem>,
  /**
   * True if this list has another page of items after this one that can be fetched.
   */
  public val hasMore: Boolean,
  /**
   * String representing the object's type. Objects of the same type share the same value. Always has the value `list`.
   */
  public val objectValue: InlineRadarValueListListItemsObjectValueX193f42fe,
  /**
   * The URL where this list can be accessed.
   */
  public val url: String,
) {
  /**
   * Details about each object.
   */
  public val `data`: List<RadarValueListItem> = data.toList()

  public class Builder {
    private var dataValue: List<RadarValueListItem>? = null

    public var `data`: List<RadarValueListItem>
      get() = requireNotNull(dataValue) { "data is required" }.toList()
      set(`value`) {
        dataValue = value.toList()
      }

    private var hasMoreValue: Boolean? = null

    public var hasMore: Boolean
      get() = requireNotNull(hasMoreValue) { "hasMore is required" }
      set(`value`) {
        hasMoreValue = value
      }

    private var objectValueValue: InlineRadarValueListListItemsObjectValueX193f42fe? = null

    public var objectValue: InlineRadarValueListListItemsObjectValueX193f42fe
      get() = requireNotNull(objectValueValue) { "objectValue is required" }
      set(`value`) {
        objectValueValue = value
      }

    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
      }

    public fun build(): InlineRadarValueListListItemsXd336042d {
      check(dataValue != null) { "data is required" }
      check(hasMoreValue != null) { "hasMore is required" }
      check(objectValueValue != null) { "objectValue is required" }
      check(urlValue != null) { "url is required" }
      return InlineRadarValueListListItemsXd336042d(
        data = data,
        hasMore = hasMore,
        objectValue = objectValue,
        url = url,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineRadarValueListListItemsXd336042d = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineRadarValueListListItemsXd336042d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineRadarValueListListItemsXd336042d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineRadarValueListListItemsXd336042d")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineRadarValueListListItemsXd336042d must be a JSON object")
      val data = json.decodeRequired<List<RadarValueListItem>>(rawObject, "data")
      val hasMore = json.decodeRequired<Boolean>(rawObject, "has_more")
      val objectValue = json.decodeRequired<InlineRadarValueListListItemsObjectValueX193f42fe>(rawObject, "object")
      val url = json.decodeRequired<String>(rawObject, "url")
      return InlineRadarValueListListItemsXd336042d(
        data = data,
        hasMore = hasMore,
        objectValue = objectValue,
        url = url,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineRadarValueListListItemsXd336042d) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineRadarValueListListItemsXd336042d")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("data", json.encodeToJsonElement(value.data))
        put("has_more", json.encodeToJsonElement(value.hasMore))
        put("object", json.encodeToJsonElement(value.objectValue))
        put("url", value.url)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineRadarValueListListItemsXd336042d(block: InlineRadarValueListListItemsXd336042d.Builder.() -> Unit): InlineRadarValueListListItemsXd336042d = InlineRadarValueListListItemsXd336042d.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineRadarValueListListItemsXd336042d is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
