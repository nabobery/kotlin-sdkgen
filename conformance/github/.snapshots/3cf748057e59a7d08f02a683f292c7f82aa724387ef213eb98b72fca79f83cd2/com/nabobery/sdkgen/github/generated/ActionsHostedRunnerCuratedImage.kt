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
 * Provides details of a hosted runner image
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/actions-hosted-runner-curated-image
 */
@Serializable(with = ActionsHostedRunnerCuratedImage.Serializer::class)
public class ActionsHostedRunnerCuratedImage(
  /**
   * Display name for this image.
   */
  public val displayName: String,
  /**
   * The ID of the image. Use this ID for the `image` parameter when creating a new larger runner.
   */
  public val id: String,
  /**
   * The operating system of the image.
   */
  public val platform: String,
  /**
   * Image size in GB.
   */
  public val sizeGb: Int,
  /**
   * The image provider.
   */
  public val source: InlineActionsHostedRunnerCuratedImageSourceXf0f99184,
) {
  public class Builder {
    private var displayNameValue: String? = null

    public var displayName: String
      get() = requireNotNull(displayNameValue) { "displayName is required" }
      set(`value`) {
        displayNameValue = value
      }

    private var idValue: String? = null

    public var id: String
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var platformValue: String? = null

    public var platform: String
      get() = requireNotNull(platformValue) { "platform is required" }
      set(`value`) {
        platformValue = value
      }

    private var sizeGbValue: Int? = null

    public var sizeGb: Int
      get() = requireNotNull(sizeGbValue) { "sizeGb is required" }
      set(`value`) {
        sizeGbValue = value
      }

    private var sourceValue: InlineActionsHostedRunnerCuratedImageSourceXf0f99184? = null

    public var source: InlineActionsHostedRunnerCuratedImageSourceXf0f99184
      get() = requireNotNull(sourceValue) { "source is required" }
      set(`value`) {
        sourceValue = value
      }

    public fun build(): ActionsHostedRunnerCuratedImage {
      check(displayNameValue != null) { "displayName is required" }
      check(idValue != null) { "id is required" }
      check(platformValue != null) { "platform is required" }
      check(sizeGbValue != null) { "sizeGb is required" }
      check(sourceValue != null) { "source is required" }
      return ActionsHostedRunnerCuratedImage(
        displayName = displayName,
        id = id,
        platform = platform,
        sizeGb = sizeGb,
        source = source,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ActionsHostedRunnerCuratedImage = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<ActionsHostedRunnerCuratedImage> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ActionsHostedRunnerCuratedImage {
      val jsonDecoder = decoder.requireJsonDecoder("ActionsHostedRunnerCuratedImage")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ActionsHostedRunnerCuratedImage must be a JSON object")
      val displayName = json.decodeRequired<String>(rawObject, "display_name")
      val id = json.decodeRequired<String>(rawObject, "id")
      val platform = json.decodeRequired<String>(rawObject, "platform")
      val sizeGb = json.decodeRequired<Int>(rawObject, "size_gb")
      val source = json.decodeRequired<InlineActionsHostedRunnerCuratedImageSourceXf0f99184>(rawObject, "source")
      return ActionsHostedRunnerCuratedImage(
        displayName = displayName,
        id = id,
        platform = platform,
        sizeGb = sizeGb,
        source = source,
      )
    }

    override fun serialize(encoder: Encoder, `value`: ActionsHostedRunnerCuratedImage) {
      val jsonEncoder = encoder.requireJsonEncoder("ActionsHostedRunnerCuratedImage")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("display_name", value.displayName)
        put("id", value.id)
        put("platform", value.platform)
        put("size_gb", json.encodeToJsonElement(value.sizeGb))
        put("source", json.encodeToJsonElement(value.source))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun actionsHostedRunnerCuratedImage(block: ActionsHostedRunnerCuratedImage.Builder.() -> Unit): ActionsHostedRunnerCuratedImage = ActionsHostedRunnerCuratedImage.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ActionsHostedRunnerCuratedImage is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
