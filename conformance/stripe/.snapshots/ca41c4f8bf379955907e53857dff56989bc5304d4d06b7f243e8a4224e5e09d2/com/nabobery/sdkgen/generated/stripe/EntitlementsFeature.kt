package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.ConsistentCopyVisibility
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
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

@ConsistentCopyVisibility
@Serializable
public data class EntitlementsFeatureView internal constructor(
  public val active: Boolean,
  public val id: String,
  public val livemode: Boolean,
  @SerialName("lookup_key")
  public val lookupKey: String,
  public val metadata: Map<String, String>,
  public val name: String,
  @SerialName("object")
  public val objectValue: InlineEntitlementsFeatureObjectValueX1e9918cd,
)

/**
 * A feature represents a monetizable ability or functionality in your system.
 * Features can be assigned to products, and when those products are purchased, Stripe will create an entitlement to the
 * feature for the purchasing customer.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/entitlements.feature
 */
@Serializable(with = EntitlementsFeature.Serializer::class)
public class EntitlementsFeature(
  /**
   * Inactive features cannot be attached to new products and will not be returned from the features list endpoint.
   */
  public val active: Boolean,
  /**
   * Unique identifier for the object.
   */
  public val id: String,
  /**
   * If the object exists in live mode, the value is `true`. If the object exists in test mode, the value is `false`.
   */
  public val livemode: Boolean,
  /**
   * A unique key you provide as your own system identifier. This may be up to 80 characters.
   */
  public val lookupKey: String,
  metadata: Map<String, String>,
  /**
   * The feature's name, for your own purpose, not meant to be displayable to the customer.
   */
  public val name: String,
  /**
   * String representing the object's type. Objects of the same type share the same value.
   */
  public val objectValue: InlineEntitlementsFeatureObjectValueX1e9918cd,
) {
  /**
   * Set of key-value pairs that you can attach to an object. This can be useful for storing additional information
   * about the object in a structured format.
   */
  public val metadata: Map<String, String> = metadata.toMap()

  public class Builder {
    private var activeValue: Boolean? = null

    public var active: Boolean
      get() = requireNotNull(activeValue) { "active is required" }
      set(`value`) {
        activeValue = value
      }

    private var idValue: String? = null

    public var id: String
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var livemodeValue: Boolean? = null

    public var livemode: Boolean
      get() = requireNotNull(livemodeValue) { "livemode is required" }
      set(`value`) {
        livemodeValue = value
      }

    private var lookupKeyValue: String? = null

    public var lookupKey: String
      get() = requireNotNull(lookupKeyValue) { "lookupKey is required" }
      set(`value`) {
        lookupKeyValue = value
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

    private var objectValueValue: InlineEntitlementsFeatureObjectValueX1e9918cd? = null

    public var objectValue: InlineEntitlementsFeatureObjectValueX1e9918cd
      get() = requireNotNull(objectValueValue) { "objectValue is required" }
      set(`value`) {
        objectValueValue = value
      }

    public fun build(): EntitlementsFeature {
      check(activeValue != null) { "active is required" }
      check(idValue != null) { "id is required" }
      check(livemodeValue != null) { "livemode is required" }
      check(lookupKeyValue != null) { "lookupKey is required" }
      check(metadataValue != null) { "metadata is required" }
      check(nameValue != null) { "name is required" }
      check(objectValueValue != null) { "objectValue is required" }
      return EntitlementsFeature(
        active = active,
        id = id,
        livemode = livemode,
        lookupKey = lookupKey,
        metadata = metadata,
        name = name,
        objectValue = objectValue,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): EntitlementsFeature = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<EntitlementsFeature> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): EntitlementsFeature {
      val jsonDecoder = decoder.requireJsonDecoder("EntitlementsFeature")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("EntitlementsFeature must be a JSON object")
      val active = json.decodeRequired<Boolean>(rawObject, "active")
      val id = json.decodeRequired<String>(rawObject, "id")
      val livemode = json.decodeRequired<Boolean>(rawObject, "livemode")
      val lookupKey = json.decodeRequired<String>(rawObject, "lookup_key")
      val metadata = json.decodeRequired<Map<String, String>>(rawObject, "metadata")
      val name = json.decodeRequired<String>(rawObject, "name")
      val objectValue = json.decodeRequired<InlineEntitlementsFeatureObjectValueX1e9918cd>(rawObject, "object")
      return EntitlementsFeature(
        active = active,
        id = id,
        livemode = livemode,
        lookupKey = lookupKey,
        metadata = metadata,
        name = name,
        objectValue = objectValue,
      )
    }

    override fun serialize(encoder: Encoder, `value`: EntitlementsFeature) {
      val jsonEncoder = encoder.requireJsonEncoder("EntitlementsFeature")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("active", json.encodeToJsonElement(value.active))
        put("id", value.id)
        put("livemode", json.encodeToJsonElement(value.livemode))
        put("lookup_key", value.lookupKey)
        put("metadata", json.encodeToJsonElement(value.metadata))
        put("name", value.name)
        put("object", json.encodeToJsonElement(value.objectValue))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun entitlementsFeature(block: EntitlementsFeature.Builder.() -> Unit): EntitlementsFeature = EntitlementsFeature.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("EntitlementsFeature is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
