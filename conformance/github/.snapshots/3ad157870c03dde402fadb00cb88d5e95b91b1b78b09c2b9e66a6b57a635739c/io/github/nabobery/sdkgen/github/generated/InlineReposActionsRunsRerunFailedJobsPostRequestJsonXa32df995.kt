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
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1actions~1runs~1{run_id}~1rerun-failed-jobs/post/request
 * Body/content/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1actions~1runs~1{run_id}~1rerun-failed-jobs/post/request
 * Body/content/application~1json/schema
 */
@Serializable(with = InlineReposActionsRunsRerunFailedJobsPostRequestJsonXa32df995.Serializer::class)
public class InlineReposActionsRunsRerunFailedJobsPostRequestJsonXa32df995(
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

    public fun build(): InlineReposActionsRunsRerunFailedJobsPostRequestJsonXa32df995 = InlineReposActionsRunsRerunFailedJobsPostRequestJsonXa32df995(
      enableDebugLogging = enableDebugLogging,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposActionsRunsRerunFailedJobsPostRequestJsonXa32df995 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReposActionsRunsRerunFailedJobsPostRequestJsonXa32df995> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposActionsRunsRerunFailedJobsPostRequestJsonXa32df995 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposActionsRunsRerunFailedJobsPostRequestJsonXa32df995")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposActionsRunsRerunFailedJobsPostRequestJsonXa32df995 must be a JSON object")
      return InlineReposActionsRunsRerunFailedJobsPostRequestJsonXa32df995(
        enableDebugLogging = rawObject["enable_debug_logging"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposActionsRunsRerunFailedJobsPostRequestJsonXa32df995) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposActionsRunsRerunFailedJobsPostRequestJsonXa32df995")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.enableDebugLogging?.let { put("enable_debug_logging", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposActionsRunsRerunFailedJobsPostRequestJsonXa32df995(block: InlineReposActionsRunsRerunFailedJobsPostRequestJsonXa32df995.Builder.() -> Unit): InlineReposActionsRunsRerunFailedJobsPostRequestJsonXa32df995 = InlineReposActionsRunsRerunFailedJobsPostRequestJsonXa32df995.build(block)
