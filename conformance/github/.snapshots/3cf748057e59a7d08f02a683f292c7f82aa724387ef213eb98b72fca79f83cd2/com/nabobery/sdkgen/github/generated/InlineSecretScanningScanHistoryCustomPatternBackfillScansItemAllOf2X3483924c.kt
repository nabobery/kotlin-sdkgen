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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/secret-scanning-scan-history/properties/custom_pattern_backfill_scan
 * s/items/allOf/1.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/secret-scanning-scan-history/properties/custom_pattern_backfill_scan
 * s/items/allOf/1
 */
@Serializable(with = InlineSecretScanningScanHistoryCustomPatternBackfillScansItemAllOf2X3483924c.Serializer::class)
public class InlineSecretScanningScanHistoryCustomPatternBackfillScansItemAllOf2X3483924c(
  /**
   * Name of the custom pattern for custom pattern scans
   */
  public val patternName: String? = null,
  /**
   * Level at which the custom pattern is defined, one of "repository", "organization", or "enterprise"
   */
  public val patternScope: String? = null,
) {
  public class Builder {
    /**
     * Name of the custom pattern for custom pattern scans
     */
    public var patternName: String? = null

    /**
     * Level at which the custom pattern is defined, one of "repository", "organization", or "enterprise"
     */
    public var patternScope: String? = null

    public fun build(): InlineSecretScanningScanHistoryCustomPatternBackfillScansItemAllOf2X3483924c = InlineSecretScanningScanHistoryCustomPatternBackfillScansItemAllOf2X3483924c(
      patternName = patternName,
      patternScope = patternScope,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineSecretScanningScanHistoryCustomPatternBackfillScansItemAllOf2X3483924c = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineSecretScanningScanHistoryCustomPatternBackfillScansItemAllOf2X3483924c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineSecretScanningScanHistoryCustomPatternBackfillScansItemAllOf2X3483924c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineSecretScanningScanHistoryCustomPatternBackfillScansItemAllOf2X3483924c")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineSecretScanningScanHistoryCustomPatternBackfillScansItemAllOf2X3483924c must be a JSON object")
      return InlineSecretScanningScanHistoryCustomPatternBackfillScansItemAllOf2X3483924c(
        patternName = rawObject["pattern_name"]?.let { json.decodeFromJsonElement<String>(it) },
        patternScope = rawObject["pattern_scope"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineSecretScanningScanHistoryCustomPatternBackfillScansItemAllOf2X3483924c) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineSecretScanningScanHistoryCustomPatternBackfillScansItemAllOf2X3483924c")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.patternName?.let { put("pattern_name", it) }
        value.patternScope?.let { put("pattern_scope", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineSecretScanningScanHistoryCustomPatternBackfillScansItemAllOf2X3483924c(block: InlineSecretScanningScanHistoryCustomPatternBackfillScansItemAllOf2X3483924c.Builder.() -> Unit): InlineSecretScanningScanHistoryCustomPatternBackfillScansItemAllOf2X3483924c = InlineSecretScanningScanHistoryCustomPatternBackfillScansItemAllOf2X3483924c.build(block)
