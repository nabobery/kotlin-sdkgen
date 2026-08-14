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
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1actions~1jobs~1{job_id}~1rerun/post/requestBody/content
 * /application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1actions~1jobs~1{job_id}~1rerun/post/requestBody/content
 * /application~1json/schema
 */
@Serializable(with = InlineReposActionsJobsRerunPostRequestJsonX6e3189d2.Serializer::class)
public class InlineReposActionsJobsRerunPostRequestJsonX6e3189d2(
  /**
   * Whether to enable debug logging for the re-run.
   */
  public val enableDebugLogging: Boolean? = null,
  /**
   * Whether to enable the debugger for the re-run of this job.
   */
  public val enableDebugger: Boolean? = null,
) {
  public class Builder {
    /**
     * Whether to enable debug logging for the re-run.
     */
    public var enableDebugLogging: Boolean? = null

    /**
     * Whether to enable the debugger for the re-run of this job.
     */
    public var enableDebugger: Boolean? = null

    public fun build(): InlineReposActionsJobsRerunPostRequestJsonX6e3189d2 = InlineReposActionsJobsRerunPostRequestJsonX6e3189d2(
      enableDebugLogging = enableDebugLogging,
      enableDebugger = enableDebugger,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposActionsJobsRerunPostRequestJsonX6e3189d2 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReposActionsJobsRerunPostRequestJsonX6e3189d2> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposActionsJobsRerunPostRequestJsonX6e3189d2 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposActionsJobsRerunPostRequestJsonX6e3189d2")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposActionsJobsRerunPostRequestJsonX6e3189d2 must be a JSON object")
      return InlineReposActionsJobsRerunPostRequestJsonX6e3189d2(
        enableDebugLogging = rawObject["enable_debug_logging"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        enableDebugger = rawObject["enable_debugger"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposActionsJobsRerunPostRequestJsonX6e3189d2) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposActionsJobsRerunPostRequestJsonX6e3189d2")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.enableDebugLogging?.let { put("enable_debug_logging", json.encodeToJsonElement(it)) }
        value.enableDebugger?.let { put("enable_debugger", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposActionsJobsRerunPostRequestJsonX6e3189d2(block: InlineReposActionsJobsRerunPostRequestJsonX6e3189d2.Builder.() -> Unit): InlineReposActionsJobsRerunPostRequestJsonX6e3189d2 = InlineReposActionsJobsRerunPostRequestJsonX6e3189d2.build(block)
