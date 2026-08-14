package io.github.nabobery.sdkgen.github.generated

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
 * The image of runner. To list all available images, use `GET /actions/hosted-runners/images/github-owned` or `GET
 * /actions/hosted-runners/images/partner`.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1actions~1hosted-runners/post/requestBody/content/application~1json
 * /schema/properties/image
 */
@Serializable(with = InlineOrgsActionsHostedRunnersPostRequestJsonImageX5da17085.Serializer::class)
public class InlineOrgsActionsHostedRunnersPostRequestJsonImageX5da17085(
  /**
   * The unique identifier of the runner image.
   */
  public val id: String? = null,
  /**
   * The source of the runner image.
   */
  public val source: InlineOrgsActionsHostedRunnersPostRequestJsonImageSourceX45a76362? = null,
  /**
   * The version of the runner image to deploy. This is relevant only for runners using custom images.
   */
  public val version: String? = null,
) {
  public class Builder {
    /**
     * The unique identifier of the runner image.
     */
    public var id: String? = null

    /**
     * The source of the runner image.
     */
    public var source: InlineOrgsActionsHostedRunnersPostRequestJsonImageSourceX45a76362? = null

    /**
     * The version of the runner image to deploy. This is relevant only for runners using custom images.
     */
    public var version: String? = null

    public fun build(): InlineOrgsActionsHostedRunnersPostRequestJsonImageX5da17085 = InlineOrgsActionsHostedRunnersPostRequestJsonImageX5da17085(
      id = id,
      source = source,
      version = version,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsActionsHostedRunnersPostRequestJsonImageX5da17085 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineOrgsActionsHostedRunnersPostRequestJsonImageX5da17085> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsActionsHostedRunnersPostRequestJsonImageX5da17085 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsActionsHostedRunnersPostRequestJsonImageX5da17085")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsActionsHostedRunnersPostRequestJsonImageX5da17085 must be a JSON object")
      return InlineOrgsActionsHostedRunnersPostRequestJsonImageX5da17085(
        id = rawObject["id"]?.let { json.decodeFromJsonElement<String>(it) },
        source = rawObject["source"]?.let { json.decodeFromJsonElement<InlineOrgsActionsHostedRunnersPostRequestJsonImageSourceX45a76362>(it) },
        version = rawObject["version"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsActionsHostedRunnersPostRequestJsonImageX5da17085) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsActionsHostedRunnersPostRequestJsonImageX5da17085")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.id?.let { put("id", it) }
        value.source?.let { put("source", json.encodeToJsonElement(it)) }
        value.version?.let { put("version", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsActionsHostedRunnersPostRequestJsonImageX5da17085(block: InlineOrgsActionsHostedRunnersPostRequestJsonImageX5da17085.Builder.() -> Unit): InlineOrgsActionsHostedRunnersPostRequestJsonImageX5da17085 = InlineOrgsActionsHostedRunnersPostRequestJsonImageX5da17085.build(block)
