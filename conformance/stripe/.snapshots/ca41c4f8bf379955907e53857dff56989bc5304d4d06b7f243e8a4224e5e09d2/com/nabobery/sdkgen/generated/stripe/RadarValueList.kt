package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
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
 * Value lists allow you to group values together which can then be referenced in rules.
 *
 * Related guide: [Default Stripe lists](https://docs.stripe.com/radar/lists#managing-list-items)
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/radar.value_list
 */
@Serializable(with = RadarValueList.Serializer::class)
public class RadarValueList(
  /**
   * The name of the value list for use in rules.
   */
  public val alias: String,
  /**
   * Time at which the object was created. Measured in seconds since the Unix epoch.
   */
  public val created: Int,
  /**
   * The name or email address of the user who created this value list.
   */
  public val createdBy: String,
  /**
   * Unique identifier for the object.
   */
  public val id: String,
  /**
   * The type of items in the value list. One of `card_fingerprint`, `card_bin`, `crypto_fingerprint`, `email`,
   * `ip_address`, `country`, `string`, `case_sensitive_string`, `customer_id`, `account`, `sepa_debit_fingerprint`, or
   * `us_bank_account_fingerprint`.
   */
  public val itemType: InlineRadarValueListItemTypeX23418d3e,
  /**
   * List of items contained within this value list.
   */
  public val listItems: InlineRadarValueListListItemsXd336042d,
  /**
   * If the object exists in live mode, the value is `true`. If the object exists in test mode, the value is `false`.
   */
  public val livemode: Boolean,
  metadata: Map<String, String>,
  /**
   * The name of the value list.
   */
  public val name: String,
  /**
   * String representing the object's type. Objects of the same type share the same value.
   */
  public val objectValue: InlineRadarValueListObjectValueX94cf621b,
) {
  /**
   * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
   * for storing additional information about the object in a structured format.
   */
  public val metadata: Map<String, String> = metadata.toMap()

  public class Builder {
    private var aliasValue: String? = null

    public var alias: String
      get() = requireNotNull(aliasValue) { "alias is required" }
      set(`value`) {
        aliasValue = value
      }

    private var createdValue: Int? = null

    public var created: Int
      get() = requireNotNull(createdValue) { "created is required" }
      set(`value`) {
        createdValue = value
      }

    private var createdByValue: String? = null

    public var createdBy: String
      get() = requireNotNull(createdByValue) { "createdBy is required" }
      set(`value`) {
        createdByValue = value
      }

    private var idValue: String? = null

    public var id: String
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var itemTypeValue: InlineRadarValueListItemTypeX23418d3e? = null

    public var itemType: InlineRadarValueListItemTypeX23418d3e
      get() = requireNotNull(itemTypeValue) { "itemType is required" }
      set(`value`) {
        itemTypeValue = value
      }

    private var listItemsValue: InlineRadarValueListListItemsXd336042d? = null

    public var listItems: InlineRadarValueListListItemsXd336042d
      get() = requireNotNull(listItemsValue) { "listItems is required" }
      set(`value`) {
        listItemsValue = value
      }

    private var livemodeValue: Boolean? = null

    public var livemode: Boolean
      get() = requireNotNull(livemodeValue) { "livemode is required" }
      set(`value`) {
        livemodeValue = value
      }

    private var metadataValue: Map<String, String>? = null

    public var metadata: Map<String, String>
      get() = requireNotNull(metadataValue) { "metadata is required" }.toMap()
      set(`value`) {
        metadataValue = value.toMap()
      }

    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    private var objectValueValue: InlineRadarValueListObjectValueX94cf621b? = null

    public var objectValue: InlineRadarValueListObjectValueX94cf621b
      get() = requireNotNull(objectValueValue) { "objectValue is required" }
      set(`value`) {
        objectValueValue = value
      }

    public fun build(): RadarValueList {
      check(aliasValue != null) { "alias is required" }
      check(createdValue != null) { "created is required" }
      check(createdByValue != null) { "createdBy is required" }
      check(idValue != null) { "id is required" }
      check(itemTypeValue != null) { "itemType is required" }
      check(listItemsValue != null) { "listItems is required" }
      check(livemodeValue != null) { "livemode is required" }
      check(metadataValue != null) { "metadata is required" }
      check(nameValue != null) { "name is required" }
      check(objectValueValue != null) { "objectValue is required" }
      return RadarValueList(
        alias = alias,
        created = created,
        createdBy = createdBy,
        id = id,
        itemType = itemType,
        listItems = listItems,
        livemode = livemode,
        metadata = metadata,
        name = name,
        objectValue = objectValue,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): RadarValueList = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<RadarValueList> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): RadarValueList {
      val jsonDecoder = decoder.requireJsonDecoder("RadarValueList")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("RadarValueList must be a JSON object")
      val alias = json.decodeRequired<String>(rawObject, "alias")
      val created = json.decodeRequired<Int>(rawObject, "created")
      val createdBy = json.decodeRequired<String>(rawObject, "created_by")
      val id = json.decodeRequired<String>(rawObject, "id")
      val itemType = json.decodeRequired<InlineRadarValueListItemTypeX23418d3e>(rawObject, "item_type")
      val listItems = json.decodeRequired<InlineRadarValueListListItemsXd336042d>(rawObject, "list_items")
      val livemode = json.decodeRequired<Boolean>(rawObject, "livemode")
      val metadata = json.decodeRequired<Map<String, String>>(rawObject, "metadata")
      val name = json.decodeRequired<String>(rawObject, "name")
      val objectValue = json.decodeRequired<InlineRadarValueListObjectValueX94cf621b>(rawObject, "object")
      return RadarValueList(
        alias = alias,
        created = created,
        createdBy = createdBy,
        id = id,
        itemType = itemType,
        listItems = listItems,
        livemode = livemode,
        metadata = metadata,
        name = name,
        objectValue = objectValue,
      )
    }

    override fun serialize(encoder: Encoder, `value`: RadarValueList) {
      val jsonEncoder = encoder.requireJsonEncoder("RadarValueList")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("alias", value.alias)
        put("created", json.encodeToJsonElement(value.created))
        put("created_by", value.createdBy)
        put("id", value.id)
        put("item_type", json.encodeToJsonElement(value.itemType))
        put("list_items", json.encodeToJsonElement(value.listItems))
        put("livemode", json.encodeToJsonElement(value.livemode))
        put("metadata", json.encodeToJsonElement(value.metadata))
        put("name", value.name)
        put("object", json.encodeToJsonElement(value.objectValue))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun radarValueList(block: RadarValueList.Builder.() -> Unit): RadarValueList = RadarValueList.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("RadarValueList is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
