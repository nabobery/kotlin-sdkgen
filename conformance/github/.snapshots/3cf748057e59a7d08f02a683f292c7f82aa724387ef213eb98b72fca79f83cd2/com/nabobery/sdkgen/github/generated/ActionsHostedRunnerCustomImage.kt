package com.nabobery.sdkgen.github.generated

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
 * Provides details of a custom runner image
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/actions-hosted-runner-custom-image
 */
@Serializable(with = ActionsHostedRunnerCustomImage.Serializer::class)
public class ActionsHostedRunnerCustomImage(
  /**
   * The ID of the image. Use this ID for the `image` parameter when creating a new larger runner.
   */
  public val id: Int,
  /**
   * The latest image version associated with the image.
   */
  public val latestVersion: String,
  /**
   * Display name for this image.
   */
  public val name: String,
  /**
   * The operating system of the image.
   */
  public val platform: String,
  /**
   * The image provider.
   */
  public val source: String,
  /**
   * The number of image versions associated with the image.
   */
  public val state: String,
  /**
   * Total size of all the image versions in GB.
   */
  public val totalVersionsSize: Int,
  /**
   * The number of image versions associated with the image.
   */
  public val versionsCount: Int,
) {
  public class Builder {
    private var idValue: Int? = null

    public var id: Int
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var latestVersionValue: String? = null

    public var latestVersion: String
      get() = requireNotNull(latestVersionValue) { "latestVersion is required" }
      set(`value`) {
        latestVersionValue = value
      }

    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    private var platformValue: String? = null

    public var platform: String
      get() = requireNotNull(platformValue) { "platform is required" }
      set(`value`) {
        platformValue = value
      }

    private var sourceValue: String? = null

    public var source: String
      get() = requireNotNull(sourceValue) { "source is required" }
      set(`value`) {
        sourceValue = value
      }

    private var stateValue: String? = null

    public var state: String
      get() = requireNotNull(stateValue) { "state is required" }
      set(`value`) {
        stateValue = value
      }

    private var totalVersionsSizeValue: Int? = null

    public var totalVersionsSize: Int
      get() = requireNotNull(totalVersionsSizeValue) { "totalVersionsSize is required" }
      set(`value`) {
        totalVersionsSizeValue = value
      }

    private var versionsCountValue: Int? = null

    public var versionsCount: Int
      get() = requireNotNull(versionsCountValue) { "versionsCount is required" }
      set(`value`) {
        versionsCountValue = value
      }

    public fun build(): ActionsHostedRunnerCustomImage {
      check(idValue != null) { "id is required" }
      check(latestVersionValue != null) { "latestVersion is required" }
      check(nameValue != null) { "name is required" }
      check(platformValue != null) { "platform is required" }
      check(sourceValue != null) { "source is required" }
      check(stateValue != null) { "state is required" }
      check(totalVersionsSizeValue != null) { "totalVersionsSize is required" }
      check(versionsCountValue != null) { "versionsCount is required" }
      return ActionsHostedRunnerCustomImage(
        id = id,
        latestVersion = latestVersion,
        name = name,
        platform = platform,
        source = source,
        state = state,
        totalVersionsSize = totalVersionsSize,
        versionsCount = versionsCount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ActionsHostedRunnerCustomImage = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<ActionsHostedRunnerCustomImage> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ActionsHostedRunnerCustomImage {
      val jsonDecoder = decoder.requireJsonDecoder("ActionsHostedRunnerCustomImage")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ActionsHostedRunnerCustomImage must be a JSON object")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val latestVersion = json.decodeRequired<String>(rawObject, "latest_version")
      val name = json.decodeRequired<String>(rawObject, "name")
      val platform = json.decodeRequired<String>(rawObject, "platform")
      val source = json.decodeRequired<String>(rawObject, "source")
      val state = json.decodeRequired<String>(rawObject, "state")
      val totalVersionsSize = json.decodeRequired<Int>(rawObject, "total_versions_size")
      val versionsCount = json.decodeRequired<Int>(rawObject, "versions_count")
      return ActionsHostedRunnerCustomImage(
        id = id,
        latestVersion = latestVersion,
        name = name,
        platform = platform,
        source = source,
        state = state,
        totalVersionsSize = totalVersionsSize,
        versionsCount = versionsCount,
      )
    }

    override fun serialize(encoder: Encoder, `value`: ActionsHostedRunnerCustomImage) {
      val jsonEncoder = encoder.requireJsonEncoder("ActionsHostedRunnerCustomImage")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("id", json.encodeToJsonElement(value.id))
        put("latest_version", value.latestVersion)
        put("name", value.name)
        put("platform", value.platform)
        put("source", value.source)
        put("state", value.state)
        put("total_versions_size", json.encodeToJsonElement(value.totalVersionsSize))
        put("versions_count", json.encodeToJsonElement(value.versionsCount))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun actionsHostedRunnerCustomImage(block: ActionsHostedRunnerCustomImage.Builder.() -> Unit): ActionsHostedRunnerCustomImage = ActionsHostedRunnerCustomImage.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ActionsHostedRunnerCustomImage is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
