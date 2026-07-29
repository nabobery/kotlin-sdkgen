package com.nabobery.sdkgen.github.generated

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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/manifest.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/manifest
 */
@Serializable(with = Manifest.Serializer::class)
public class Manifest(
  /**
   * The name of the manifest.
   */
  public val name: String,
  public val `file`: InlineManifestFileXba730a13? = null,
  metadata: Map<String, InlineMetadataAdditionalValueXa8c346f6?>? = null,
  resolved: Map<String, Dependency>? = null,
) {
  public val metadata: Map<String, InlineMetadataAdditionalValueXa8c346f6?>? =
      metadata?.let { collection0 -> collection0.toMap() }

  /**
   * A collection of resolved package dependencies.
   */
  public val resolved: Map<String, Dependency>? =
      resolved?.let { collection0 -> collection0.toMap() }

  public class Builder {
    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    public var `file`: InlineManifestFileXba730a13? = null

    private var metadataValue: Map<String, InlineMetadataAdditionalValueXa8c346f6?>? = null

    public var metadata: Map<String, InlineMetadataAdditionalValueXa8c346f6?>?
      get() = metadataValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        metadataValue = value?.let { collection0 -> collection0.toMap() }
      }

    private var resolvedValue: Map<String, Dependency>? = null

    /**
     * A collection of resolved package dependencies.
     */
    public var resolved: Map<String, Dependency>?
      get() = resolvedValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        resolvedValue = value?.let { collection0 -> collection0.toMap() }
      }

    public fun build(): Manifest {
      check(nameValue != null) { "name is required" }
      return Manifest(
        name = name,
        file = file,
        metadata = metadata,
        resolved = resolved,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): Manifest = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<Manifest> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): Manifest {
      val jsonDecoder = decoder.requireJsonDecoder("Manifest")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("Manifest must be a JSON object")
      val name = json.decodeRequired<String>(rawObject, "name")
      return Manifest(
        name = name,
        file = rawObject["file"]?.let { json.decodeFromJsonElement<InlineManifestFileXba730a13>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<Map<String, InlineMetadataAdditionalValueXa8c346f6?>>(it) },
        resolved = rawObject["resolved"]?.let { json.decodeFromJsonElement<Map<String, Dependency>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: Manifest) {
      val jsonEncoder = encoder.requireJsonEncoder("Manifest")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("name", value.name)
        value.file?.let { put("file", json.encodeToJsonElement(it)) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
        value.resolved?.let { put("resolved", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun manifest(block: Manifest.Builder.() -> Unit): Manifest = Manifest.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("Manifest is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
