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
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1secret-scanning~1custom-patterns/post/responses/201/content/applic
 * ation~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1secret-scanning~1custom-patterns/post/responses/201/content/applic
 * ation~1json/schema
 */
@Serializable(with = InlineOrgsSecretScanningCustomPatternsPostResponse201JsonXc9d3414f.Serializer::class)
public class InlineOrgsSecretScanningCustomPatternsPostResponse201JsonXc9d3414f(
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

    public fun build(): InlineOrgsSecretScanningCustomPatternsPostResponse201JsonXc9d3414f = InlineOrgsSecretScanningCustomPatternsPostResponse201JsonXc9d3414f(
      createdPatterns = createdPatterns,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsSecretScanningCustomPatternsPostResponse201JsonXc9d3414f = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineOrgsSecretScanningCustomPatternsPostResponse201JsonXc9d3414f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsSecretScanningCustomPatternsPostResponse201JsonXc9d3414f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsSecretScanningCustomPatternsPostResponse201JsonXc9d3414f")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsSecretScanningCustomPatternsPostResponse201JsonXc9d3414f must be a JSON object")
      return InlineOrgsSecretScanningCustomPatternsPostResponse201JsonXc9d3414f(
        createdPatterns = rawObject["created_patterns"]?.let { json.decodeFromJsonElement<List<SecretScanningCustomPattern>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsSecretScanningCustomPatternsPostResponse201JsonXc9d3414f) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsSecretScanningCustomPatternsPostResponse201JsonXc9d3414f")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.createdPatterns?.let { put("created_patterns", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsSecretScanningCustomPatternsPostResponse201JsonXc9d3414f(block: InlineOrgsSecretScanningCustomPatternsPostResponse201JsonXc9d3414f.Builder.() -> Unit): InlineOrgsSecretScanningCustomPatternsPostResponse201JsonXc9d3414f = InlineOrgsSecretScanningCustomPatternsPostResponse201JsonXc9d3414f.build(block)
