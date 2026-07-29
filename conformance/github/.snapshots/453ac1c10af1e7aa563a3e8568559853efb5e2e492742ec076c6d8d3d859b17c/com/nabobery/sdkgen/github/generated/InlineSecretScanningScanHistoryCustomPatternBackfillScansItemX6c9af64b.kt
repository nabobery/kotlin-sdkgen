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
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/secret-scanning-scan-history/properties/custom_pattern_backfill_scan
 * s/items.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/secret-scanning-scan-history/properties/custom_pattern_backfill_scan
 * s/items
 */
@Serializable(with = InlineSecretScanningScanHistoryCustomPatternBackfillScansItemX6c9af64b.Serializer::class)
public class InlineSecretScanningScanHistoryCustomPatternBackfillScansItemX6c9af64b(
  /**
   * The time that the scan was completed. Empty if the scan is running
   *
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val completedAt: String? = null,
  /**
   * Name of the custom pattern for custom pattern scans
   */
  public val patternName: String? = null,
  /**
   * Level at which the custom pattern is defined, one of "repository", "organization", or "enterprise"
   */
  public val patternScope: String? = null,
  /**
   * The time that the scan was started. Empty if the scan is pending
   *
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
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
     *
     * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var completedAt: String? = null

    /**
     * Name of the custom pattern for custom pattern scans
     */
    public var patternName: String? = null

    /**
     * Level at which the custom pattern is defined, one of "repository", "organization", or "enterprise"
     */
    public var patternScope: String? = null

    /**
     * The time that the scan was started. Empty if the scan is pending
     *
     * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
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

    public fun build(): InlineSecretScanningScanHistoryCustomPatternBackfillScansItemX6c9af64b = InlineSecretScanningScanHistoryCustomPatternBackfillScansItemX6c9af64b(
      completedAt = completedAt,
      patternName = patternName,
      patternScope = patternScope,
      startedAt = startedAt,
      status = status,
      type = type,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineSecretScanningScanHistoryCustomPatternBackfillScansItemX6c9af64b = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineSecretScanningScanHistoryCustomPatternBackfillScansItemX6c9af64b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineSecretScanningScanHistoryCustomPatternBackfillScansItemX6c9af64b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineSecretScanningScanHistoryCustomPatternBackfillScansItemX6c9af64b")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineSecretScanningScanHistoryCustomPatternBackfillScansItemX6c9af64b must be a JSON object")
      return InlineSecretScanningScanHistoryCustomPatternBackfillScansItemX6c9af64b(
        completedAt = rawObject["completed_at"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        patternName = rawObject["pattern_name"]?.let { json.decodeFromJsonElement<String>(it) },
        patternScope = rawObject["pattern_scope"]?.let { json.decodeFromJsonElement<String>(it) },
        startedAt = rawObject["started_at"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        status = rawObject["status"]?.let { json.decodeFromJsonElement<String>(it) },
        type = rawObject["type"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineSecretScanningScanHistoryCustomPatternBackfillScansItemX6c9af64b) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineSecretScanningScanHistoryCustomPatternBackfillScansItemX6c9af64b")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.completedAt?.let { put("completed_at", it) }
        value.patternName?.let { put("pattern_name", it) }
        value.patternScope?.let { put("pattern_scope", it) }
        value.startedAt?.let { put("started_at", it) }
        value.status?.let { put("status", it) }
        value.type?.let { put("type", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineSecretScanningScanHistoryCustomPatternBackfillScansItemX6c9af64b(block: InlineSecretScanningScanHistoryCustomPatternBackfillScansItemX6c9af64b.Builder.() -> Unit): InlineSecretScanningScanHistoryCustomPatternBackfillScansItemX6c9af64b = InlineSecretScanningScanHistoryCustomPatternBackfillScansItemX6c9af64b.build(block)
