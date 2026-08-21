package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlin.collections.List
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
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1radar~1value_lists/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1radar~1value_lists/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema
 */
@Serializable(with = InlineV1RadarValueListsPostRequestFormXd6e26112.Serializer::class)
public class InlineV1RadarValueListsPostRequestFormXd6e26112(
  /**
   * The name of the value list for use in rules.
   */
  public val alias: String,
  /**
   * The human-readable name of the value list.
   */
  public val name: String,
  expand: List<String>? = null,
  /**
   * Type of the items in the value list. One of `card_fingerprint`, `card_bin`, `crypto_fingerprint`, `email`,
   * `ip_address`, `country`, `string`, `case_sensitive_string`, `customer_id`, `account`, `sepa_debit_fingerprint`, or
   * `us_bank_account_fingerprint`. Use `string` if the item type is unknown or mixed.
   */
  public val itemType: InlineV1RadarValueListsPostRequestFormItemTypeXa7255c8e? = null,
  metadata: Map<String, String>? = null,
) {
  /**
   * Specifies which fields in the response should be expanded.
   */
  public val expand: List<String>? = expand?.let { collection0 -> collection0.toList() }

  /**
   * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
   * for storing additional information about the object in a structured format. Individual keys can be unset by posting
   * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
   */
  public val metadata: Map<String, String>? = metadata?.let { collection0 -> collection0.toMap() }

  public class Builder {
    private var aliasValue: String? = null

    public var alias: String
      get() = requireNotNull(aliasValue) { "alias is required" }
      set(`value`) {
        aliasValue = value
      }

    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    private var expandValue: List<String>? = null

    /**
     * Specifies which fields in the response should be expanded.
     */
    public var expand: List<String>?
      get() = expandValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        expandValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * Type of the items in the value list. One of `card_fingerprint`, `card_bin`, `crypto_fingerprint`, `email`,
     * `ip_address`, `country`, `string`, `case_sensitive_string`, `customer_id`, `account`, `sepa_debit_fingerprint`,
     * or `us_bank_account_fingerprint`. Use `string` if the item type is unknown or mixed.
     */
    public var itemType: InlineV1RadarValueListsPostRequestFormItemTypeXa7255c8e? = null

    private var metadataValue: Map<String, String>? = null

    /**
     * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be
     * useful for storing additional information about the object in a structured format. Individual keys can be unset
     * by posting an empty value to them. All keys can be unset by posting an empty value to `metadata`.
     */
    public var metadata: Map<String, String>?
      get() = metadataValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        metadataValue = value?.let { collection0 -> collection0.toMap() }
      }

    public fun build(): InlineV1RadarValueListsPostRequestFormXd6e26112 {
      check(aliasValue != null) { "alias is required" }
      check(nameValue != null) { "name is required" }
      return InlineV1RadarValueListsPostRequestFormXd6e26112(
        alias = alias,
        name = name,
        expand = expand,
        itemType = itemType,
        metadata = metadata,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1RadarValueListsPostRequestFormXd6e26112 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1RadarValueListsPostRequestFormXd6e26112> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1RadarValueListsPostRequestFormXd6e26112 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1RadarValueListsPostRequestFormXd6e26112")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1RadarValueListsPostRequestFormXd6e26112 must be a JSON object")
      val alias = json.decodeRequired<String>(rawObject, "alias")
      val name = json.decodeRequired<String>(rawObject, "name")
      return InlineV1RadarValueListsPostRequestFormXd6e26112(
        alias = alias,
        name = name,
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        itemType = rawObject["item_type"]?.let { json.decodeFromJsonElement<InlineV1RadarValueListsPostRequestFormItemTypeXa7255c8e>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1RadarValueListsPostRequestFormXd6e26112) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1RadarValueListsPostRequestFormXd6e26112")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("alias", value.alias)
        put("name", value.name)
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
        value.itemType?.let { put("item_type", json.encodeToJsonElement(it)) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1RadarValueListsPostRequestFormXd6e26112(block: InlineV1RadarValueListsPostRequestFormXd6e26112.Builder.() -> Unit): InlineV1RadarValueListsPostRequestFormXd6e26112 = InlineV1RadarValueListsPostRequestFormXd6e26112.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1RadarValueListsPostRequestFormXd6e26112 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
