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
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * You can use `run_url` to track the status of the run. This includes a property status and conclusion.
 * You should not rely on this always being an actions workflow run object.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/code-quality-setup-update-response
 */
@Serializable(with = CodeQualitySetupUpdateResponse.Serializer::class)
public class CodeQualitySetupUpdateResponse(
  /**
   * ID of the corresponding run.
   */
  public val runId: Int? = null,
  /**
   * URL of the corresponding run.
   */
  public val runUrl: String? = null,
) {
  public class Builder {
    /**
     * ID of the corresponding run.
     */
    public var runId: Int? = null

    /**
     * URL of the corresponding run.
     */
    public var runUrl: String? = null

    public fun build(): CodeQualitySetupUpdateResponse = CodeQualitySetupUpdateResponse(
      runId = runId,
      runUrl = runUrl,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CodeQualitySetupUpdateResponse = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<CodeQualitySetupUpdateResponse> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CodeQualitySetupUpdateResponse {
      val jsonDecoder = decoder.requireJsonDecoder("CodeQualitySetupUpdateResponse")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("CodeQualitySetupUpdateResponse must be a JSON object")
      return CodeQualitySetupUpdateResponse(
        runId = rawObject["run_id"]?.let { json.decodeFromJsonElement<Int>(it) },
        runUrl = rawObject["run_url"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: CodeQualitySetupUpdateResponse) {
      val jsonEncoder = encoder.requireJsonEncoder("CodeQualitySetupUpdateResponse")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.runId?.let { put("run_id", json.encodeToJsonElement(it)) }
        value.runUrl?.let { put("run_url", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun codeQualitySetupUpdateResponse(block: CodeQualitySetupUpdateResponse.Builder.() -> Unit): CodeQualitySetupUpdateResponse = CodeQualitySetupUpdateResponse.build(block)
