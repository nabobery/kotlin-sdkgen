package com.nabobery.sdkgen.github.generated

import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1secret-scanning~1custom-patterns/post/requestBody/content/applicat
 * ion~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1secret-scanning~1custom-patterns/post/requestBody/content/applicat
 * ion~1json/schema
 */
@Serializable(with = InlineOrgsSecretScanningCustomPatternsPostRequestJsonXfc441516.Serializer::class)
public class InlineOrgsSecretScanningCustomPatternsPostRequestJsonXfc441516(
  patterns: List<SecretScanningCustomPatternToCreate>,
) {
  /**
   * The list of custom patterns to create.
   */
  public val patterns: List<SecretScanningCustomPatternToCreate> = patterns.toList()

  public class Builder {
    private var patternsValue: List<SecretScanningCustomPatternToCreate>? = null

    public var patterns: List<SecretScanningCustomPatternToCreate>
      get() = requireNotNull(patternsValue) { "patterns is required" }.toList()
      set(`value`) {
        patternsValue = value.toList()
      }

    public fun build(): InlineOrgsSecretScanningCustomPatternsPostRequestJsonXfc441516 {
      check(patternsValue != null) { "patterns is required" }
      return InlineOrgsSecretScanningCustomPatternsPostRequestJsonXfc441516(
        patterns = patterns,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsSecretScanningCustomPatternsPostRequestJsonXfc441516 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineOrgsSecretScanningCustomPatternsPostRequestJsonXfc441516> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsSecretScanningCustomPatternsPostRequestJsonXfc441516 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsSecretScanningCustomPatternsPostRequestJsonXfc441516")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsSecretScanningCustomPatternsPostRequestJsonXfc441516 must be a JSON object")
      val patterns = json.decodeRequired<List<SecretScanningCustomPatternToCreate>>(rawObject, "patterns")
      return InlineOrgsSecretScanningCustomPatternsPostRequestJsonXfc441516(
        patterns = patterns,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsSecretScanningCustomPatternsPostRequestJsonXfc441516) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsSecretScanningCustomPatternsPostRequestJsonXfc441516")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("patterns", json.encodeToJsonElement(value.patterns))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsSecretScanningCustomPatternsPostRequestJsonXfc441516(block: InlineOrgsSecretScanningCustomPatternsPostRequestJsonXfc441516.Builder.() -> Unit): InlineOrgsSecretScanningCustomPatternsPostRequestJsonXfc441516 = InlineOrgsSecretScanningCustomPatternsPostRequestJsonXfc441516.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOrgsSecretScanningCustomPatternsPostRequestJsonXfc441516 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
