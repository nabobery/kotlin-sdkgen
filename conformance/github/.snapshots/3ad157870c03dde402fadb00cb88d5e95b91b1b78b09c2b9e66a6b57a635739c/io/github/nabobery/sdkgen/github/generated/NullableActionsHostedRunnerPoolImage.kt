package io.github.nabobery.sdkgen.github.generated

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
 * Source: sdkgen://source/openapi.yaml#/components/schemas/nullable-actions-hosted-runner-pool-image
 */
@Serializable(with = NullableActionsHostedRunnerPoolImage.Serializer::class)
public class NullableActionsHostedRunnerPoolImage(
  /**
   * Display name for this image.
   */
  public val displayName: String,
  /**
   * The ID of the image. Use this ID for the `image` parameter when creating a new larger runner.
   */
  public val id: String,
  /**
   * Image size in GB.
   */
  public val sizeGb: Int,
  /**
   * The image provider.
   */
  public val source: InlineNullableActionsHostedRunnerPoolImageSourceXadd80e69,
  /**
   * The image version of the hosted runner pool.
   */
  public val version: String? = null,
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

    private var sizeGbValue: Int? = null

    public var sizeGb: Int
      get() = requireNotNull(sizeGbValue) { "sizeGb is required" }
      set(`value`) {
        sizeGbValue = value
      }

    private var sourceValue: InlineNullableActionsHostedRunnerPoolImageSourceXadd80e69? = null

    public var source: InlineNullableActionsHostedRunnerPoolImageSourceXadd80e69
      get() = requireNotNull(sourceValue) { "source is required" }
      set(`value`) {
        sourceValue = value
      }

    /**
     * The image version of the hosted runner pool.
     */
    public var version: String? = null

    public fun build(): NullableActionsHostedRunnerPoolImage {
      check(displayNameValue != null) { "displayName is required" }
      check(idValue != null) { "id is required" }
      check(sizeGbValue != null) { "sizeGb is required" }
      check(sourceValue != null) { "source is required" }
      return NullableActionsHostedRunnerPoolImage(
        displayName = displayName,
        id = id,
        sizeGb = sizeGb,
        source = source,
        version = version,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): NullableActionsHostedRunnerPoolImage = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<NullableActionsHostedRunnerPoolImage> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): NullableActionsHostedRunnerPoolImage {
      val jsonDecoder = decoder.requireJsonDecoder("NullableActionsHostedRunnerPoolImage")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("NullableActionsHostedRunnerPoolImage must be a JSON object")
      val displayName = json.decodeRequired<String>(rawObject, "display_name")
      val id = json.decodeRequired<String>(rawObject, "id")
      val sizeGb = json.decodeRequired<Int>(rawObject, "size_gb")
      val source = json.decodeRequired<InlineNullableActionsHostedRunnerPoolImageSourceXadd80e69>(rawObject, "source")
      return NullableActionsHostedRunnerPoolImage(
        displayName = displayName,
        id = id,
        sizeGb = sizeGb,
        source = source,
        version = rawObject["version"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: NullableActionsHostedRunnerPoolImage) {
      val jsonEncoder = encoder.requireJsonEncoder("NullableActionsHostedRunnerPoolImage")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("display_name", value.displayName)
        put("id", value.id)
        put("size_gb", json.encodeToJsonElement(value.sizeGb))
        put("source", json.encodeToJsonElement(value.source))
        value.version?.let { put("version", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun nullableActionsHostedRunnerPoolImage(block: NullableActionsHostedRunnerPoolImage.Builder.() -> Unit): NullableActionsHostedRunnerPoolImage = NullableActionsHostedRunnerPoolImage.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("NullableActionsHostedRunnerPoolImage is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
