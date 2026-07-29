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
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * A custom pattern to delete in a bulk operation.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/secret-scanning-custom-pattern-to-delete
 */
@Serializable(with = SecretScanningCustomPatternToDelete.Serializer::class)
public class SecretScanningCustomPatternToDelete(
  /**
   * The ID of the custom pattern to delete.
   */
  public val patternId: Int,
  public val customPatternVersion: String? = null,
) {
  public class Builder {
    private var patternIdValue: Int? = null

    public var patternId: Int
      get() = requireNotNull(patternIdValue) { "patternId is required" }
      set(`value`) {
        patternIdValue = value
      }

    public var customPatternVersion: String? = null

    public fun build(): SecretScanningCustomPatternToDelete {
      check(patternIdValue != null) { "patternId is required" }
      return SecretScanningCustomPatternToDelete(
        patternId = patternId,
        customPatternVersion = customPatternVersion,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): SecretScanningCustomPatternToDelete = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<SecretScanningCustomPatternToDelete> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): SecretScanningCustomPatternToDelete {
      val jsonDecoder = decoder.requireJsonDecoder("SecretScanningCustomPatternToDelete")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("SecretScanningCustomPatternToDelete must be a JSON object")
      val patternId = json.decodeRequired<Int>(rawObject, "pattern_id")
      return SecretScanningCustomPatternToDelete(
        patternId = patternId,
        customPatternVersion = rawObject["custom_pattern_version"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: SecretScanningCustomPatternToDelete) {
      val jsonEncoder = encoder.requireJsonEncoder("SecretScanningCustomPatternToDelete")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("pattern_id", json.encodeToJsonElement(value.patternId))
        value.customPatternVersion?.let { put("custom_pattern_version", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun secretScanningCustomPatternToDelete(block: SecretScanningCustomPatternToDelete.Builder.() -> Unit): SecretScanningCustomPatternToDelete = SecretScanningCustomPatternToDelete.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("SecretScanningCustomPatternToDelete is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
