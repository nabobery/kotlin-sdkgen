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
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1secret-scanning~1custom-patterns/post/requestBody/conte
 * nt/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1secret-scanning~1custom-patterns/post/requestBody/conte
 * nt/application~1json/schema
 */
@Serializable(with = InlineReposSecretScanningCustomPatternsPostRequestJsonXfc75df14.Serializer::class)
public class InlineReposSecretScanningCustomPatternsPostRequestJsonXfc75df14(
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

    public fun build(): InlineReposSecretScanningCustomPatternsPostRequestJsonXfc75df14 {
      check(patternsValue != null) { "patterns is required" }
      return InlineReposSecretScanningCustomPatternsPostRequestJsonXfc75df14(
        patterns = patterns,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposSecretScanningCustomPatternsPostRequestJsonXfc75df14 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineReposSecretScanningCustomPatternsPostRequestJsonXfc75df14> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposSecretScanningCustomPatternsPostRequestJsonXfc75df14 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposSecretScanningCustomPatternsPostRequestJsonXfc75df14")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposSecretScanningCustomPatternsPostRequestJsonXfc75df14 must be a JSON object")
      val patterns = json.decodeRequired<List<SecretScanningCustomPatternToCreate>>(rawObject, "patterns")
      return InlineReposSecretScanningCustomPatternsPostRequestJsonXfc75df14(
        patterns = patterns,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposSecretScanningCustomPatternsPostRequestJsonXfc75df14) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposSecretScanningCustomPatternsPostRequestJsonXfc75df14")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("patterns", json.encodeToJsonElement(value.patterns))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposSecretScanningCustomPatternsPostRequestJsonXfc75df14(block: InlineReposSecretScanningCustomPatternsPostRequestJsonXfc75df14.Builder.() -> Unit): InlineReposSecretScanningCustomPatternsPostRequestJsonXfc75df14 = InlineReposSecretScanningCustomPatternsPostRequestJsonXfc75df14.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineReposSecretScanningCustomPatternsPostRequestJsonXfc75df14 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
