package com.nabobery.sdkgen.github.generated

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
import kotlinx.serialization.json.put

/**
 * Information on a single scan performed by secret scanning on the repository
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/secret-scanning-scan
 */
@Serializable(with = SecretScanningScan.Serializer::class)
public class SecretScanningScan(
  /**
   * The time that the scan was completed. Empty if the scan is running
   */
  public val completedAt: String? = null,
  /**
   * The time that the scan was started. Empty if the scan is pending
   */
  public val startedAt: String? = null,
  /**
   * The state of the scan. Either "completed", "running", "pending", "failed", or "unknown".
   *
   * "failed": this scan type has hit its retry limit and has been marked permanently failed.
   * This usually resolves on its own at the next scheduled scan attempt. If "failed" persists, contact Support.
   *
   * "unknown": the scan is in an unrecognized or currently unhandled state.
   */
  public val status: String? = null,
  /**
   * The type of scan
   */
  public val type: String? = null,
) {
  public class Builder {
    /**
     * The time that the scan was completed. Empty if the scan is running
     */
    public var completedAt: String? = null

    /**
     * The time that the scan was started. Empty if the scan is pending
     */
    public var startedAt: String? = null

    /**
     * The state of the scan. Either "completed", "running", "pending", "failed", or "unknown".
     *
     * "failed": this scan type has hit its retry limit and has been marked permanently failed.
     * This usually resolves on its own at the next scheduled scan attempt. If "failed" persists, contact Support.
     *
     * "unknown": the scan is in an unrecognized or currently unhandled state.
     */
    public var status: String? = null

    /**
     * The type of scan
     */
    public var type: String? = null

    public fun build(): SecretScanningScan = SecretScanningScan(
      completedAt = completedAt,
      startedAt = startedAt,
      status = status,
      type = type,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): SecretScanningScan = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<SecretScanningScan> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): SecretScanningScan {
      val jsonDecoder = decoder.requireJsonDecoder("SecretScanningScan")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("SecretScanningScan must be a JSON object")
      return SecretScanningScan(
        completedAt = rawObject["completed_at"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        startedAt = rawObject["started_at"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        status = rawObject["status"]?.let { json.decodeFromJsonElement<String>(it) },
        type = rawObject["type"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: SecretScanningScan) {
      val jsonEncoder = encoder.requireJsonEncoder("SecretScanningScan")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.completedAt?.let { put("completed_at", it) }
        value.startedAt?.let { put("started_at", it) }
        value.status?.let { put("status", it) }
        value.type?.let { put("type", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun secretScanningScan(block: SecretScanningScan.Builder.() -> Unit): SecretScanningScan = SecretScanningScan.build(block)
