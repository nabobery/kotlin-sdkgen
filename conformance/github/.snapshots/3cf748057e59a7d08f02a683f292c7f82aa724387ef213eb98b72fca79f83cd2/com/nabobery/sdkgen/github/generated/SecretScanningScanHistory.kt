package com.nabobery.sdkgen.github.generated

import kotlin.Unit
import kotlin.collections.List
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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/secret-scanning-scan-history.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/secret-scanning-scan-history
 */
@Serializable(with = SecretScanningScanHistory.Serializer::class)
public class SecretScanningScanHistory(
  public val backfillScans: List<SecretScanningScan>? = null,
  public val customPatternBackfillScans:
      List<InlineSecretScanningScanHistoryCustomPatternBackfillScansItemX6c9af64b>? = null,
  public val genericSecretsBackfillScans: List<SecretScanningScan>? = null,
  public val incrementalScans: List<SecretScanningScan>? = null,
  public val patternUpdateScans: List<SecretScanningScan>? = null,
) {
  public class Builder {
    public var backfillScans: List<SecretScanningScan>? = null

    public var customPatternBackfillScans:
        List<InlineSecretScanningScanHistoryCustomPatternBackfillScansItemX6c9af64b>? = null

    public var genericSecretsBackfillScans: List<SecretScanningScan>? = null

    public var incrementalScans: List<SecretScanningScan>? = null

    public var patternUpdateScans: List<SecretScanningScan>? = null

    public fun build(): SecretScanningScanHistory = SecretScanningScanHistory(
      backfillScans = backfillScans,
      customPatternBackfillScans = customPatternBackfillScans,
      genericSecretsBackfillScans = genericSecretsBackfillScans,
      incrementalScans = incrementalScans,
      patternUpdateScans = patternUpdateScans,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): SecretScanningScanHistory = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<SecretScanningScanHistory> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): SecretScanningScanHistory {
      val jsonDecoder = decoder.requireJsonDecoder("SecretScanningScanHistory")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("SecretScanningScanHistory must be a JSON object")
      return SecretScanningScanHistory(
        backfillScans = rawObject["backfill_scans"]?.let { json.decodeFromJsonElement<List<SecretScanningScan>>(it) },
        customPatternBackfillScans = rawObject["custom_pattern_backfill_scans"]?.let { json.decodeFromJsonElement<List<InlineSecretScanningScanHistoryCustomPatternBackfillScansItemX6c9af64b>>(it) },
        genericSecretsBackfillScans = rawObject["generic_secrets_backfill_scans"]?.let { json.decodeFromJsonElement<List<SecretScanningScan>>(it) },
        incrementalScans = rawObject["incremental_scans"]?.let { json.decodeFromJsonElement<List<SecretScanningScan>>(it) },
        patternUpdateScans = rawObject["pattern_update_scans"]?.let { json.decodeFromJsonElement<List<SecretScanningScan>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: SecretScanningScanHistory) {
      val jsonEncoder = encoder.requireJsonEncoder("SecretScanningScanHistory")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.backfillScans?.let { put("backfill_scans", json.encodeToJsonElement(it)) }
        value.customPatternBackfillScans?.let { put("custom_pattern_backfill_scans", json.encodeToJsonElement(it)) }
        value.genericSecretsBackfillScans?.let { put("generic_secrets_backfill_scans", json.encodeToJsonElement(it)) }
        value.incrementalScans?.let { put("incremental_scans", json.encodeToJsonElement(it)) }
        value.patternUpdateScans?.let { put("pattern_update_scans", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun secretScanningScanHistory(block: SecretScanningScanHistory.Builder.() -> Unit): SecretScanningScanHistory = SecretScanningScanHistory.build(block)
