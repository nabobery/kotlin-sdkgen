package io.github.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1actions~1runs~1{run_id}~1rerun/post/requestBody/content
 * /application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1actions~1runs~1{run_id}~1rerun/post/requestBody/content
 * /application~1json/schema
 */
@Serializable(with = InlineReposActionsRunsRerunPostRequestJsonXf91bbae0.Serializer::class)
public class InlineReposActionsRunsRerunPostRequestJsonXf91bbae0(
  /**
   * Whether to enable debug logging for the re-run.
   */
  public val enableDebugLogging: Boolean? = null,
) {
  public class Builder {
    /**
     * Whether to enable debug logging for the re-run.
     */
    public var enableDebugLogging: Boolean? = null

    public fun build(): InlineReposActionsRunsRerunPostRequestJsonXf91bbae0 = InlineReposActionsRunsRerunPostRequestJsonXf91bbae0(
      enableDebugLogging = enableDebugLogging,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposActionsRunsRerunPostRequestJsonXf91bbae0 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReposActionsRunsRerunPostRequestJsonXf91bbae0> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposActionsRunsRerunPostRequestJsonXf91bbae0 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposActionsRunsRerunPostRequestJsonXf91bbae0")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposActionsRunsRerunPostRequestJsonXf91bbae0 must be a JSON object")
      return InlineReposActionsRunsRerunPostRequestJsonXf91bbae0(
        enableDebugLogging = rawObject["enable_debug_logging"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposActionsRunsRerunPostRequestJsonXf91bbae0) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposActionsRunsRerunPostRequestJsonXf91bbae0")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.enableDebugLogging?.let { put("enable_debug_logging", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposActionsRunsRerunPostRequestJsonXf91bbae0(block: InlineReposActionsRunsRerunPostRequestJsonXf91bbae0.Builder.() -> Unit): InlineReposActionsRunsRerunPostRequestJsonXf91bbae0 = InlineReposActionsRunsRerunPostRequestJsonXf91bbae0.build(block)
