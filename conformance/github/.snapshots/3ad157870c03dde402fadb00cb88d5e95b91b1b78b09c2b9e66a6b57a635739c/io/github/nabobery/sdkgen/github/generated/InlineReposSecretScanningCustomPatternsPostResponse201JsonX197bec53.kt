package io.github.nabobery.sdkgen.github.generated

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
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1secret-scanning~1custom-patterns/post/responses/201/con
 * tent/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1secret-scanning~1custom-patterns/post/responses/201/con
 * tent/application~1json/schema
 */
@Serializable(with = InlineReposSecretScanningCustomPatternsPostResponse201JsonX197bec53.Serializer::class)
public class InlineReposSecretScanningCustomPatternsPostResponse201JsonX197bec53(
  createdPatterns: List<SecretScanningCustomPattern>? = null,
) {
  /**
   * The list of successfully created custom patterns.
   */
  public val createdPatterns: List<SecretScanningCustomPattern>? =
      createdPatterns?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var createdPatternsValue: List<SecretScanningCustomPattern>? = null

    /**
     * The list of successfully created custom patterns.
     */
    public var createdPatterns: List<SecretScanningCustomPattern>?
      get() = createdPatternsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        createdPatternsValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineReposSecretScanningCustomPatternsPostResponse201JsonX197bec53 = InlineReposSecretScanningCustomPatternsPostResponse201JsonX197bec53(
      createdPatterns = createdPatterns,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposSecretScanningCustomPatternsPostResponse201JsonX197bec53 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReposSecretScanningCustomPatternsPostResponse201JsonX197bec53> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposSecretScanningCustomPatternsPostResponse201JsonX197bec53 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposSecretScanningCustomPatternsPostResponse201JsonX197bec53")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposSecretScanningCustomPatternsPostResponse201JsonX197bec53 must be a JSON object")
      return InlineReposSecretScanningCustomPatternsPostResponse201JsonX197bec53(
        createdPatterns = rawObject["created_patterns"]?.let { json.decodeFromJsonElement<List<SecretScanningCustomPattern>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposSecretScanningCustomPatternsPostResponse201JsonX197bec53) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposSecretScanningCustomPatternsPostResponse201JsonX197bec53")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.createdPatterns?.let { put("created_patterns", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposSecretScanningCustomPatternsPostResponse201JsonX197bec53(block: InlineReposSecretScanningCustomPatternsPostResponse201JsonX197bec53.Builder.() -> Unit): InlineReposSecretScanningCustomPatternsPostResponse201JsonX197bec53 = InlineReposSecretScanningCustomPatternsPostResponse201JsonX197bec53.build(block)
