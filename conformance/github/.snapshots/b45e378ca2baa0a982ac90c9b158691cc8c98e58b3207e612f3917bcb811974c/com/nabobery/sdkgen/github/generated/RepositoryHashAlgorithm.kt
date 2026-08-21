package com.nabobery.sdkgen.github.generated

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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Repository hash algorithm
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/repository-hash-algorithm
 */
@Serializable(with = RepositoryHashAlgorithm.Serializer::class)
public class RepositoryHashAlgorithm(
  /**
   * The Git hash algorithm used by this repository.
   */
  public val hashAlgorithm: InlineRepositoryHashAlgorithmHashAlgorithmX7db50032,
) {
  public class Builder {
    private var hashAlgorithmValue: InlineRepositoryHashAlgorithmHashAlgorithmX7db50032? = null

    public var hashAlgorithm: InlineRepositoryHashAlgorithmHashAlgorithmX7db50032
      get() = requireNotNull(hashAlgorithmValue) { "hashAlgorithm is required" }
      set(`value`) {
        hashAlgorithmValue = value
      }

    public fun build(): RepositoryHashAlgorithm {
      check(hashAlgorithmValue != null) { "hashAlgorithm is required" }
      return RepositoryHashAlgorithm(
        hashAlgorithm = hashAlgorithm,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): RepositoryHashAlgorithm = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<RepositoryHashAlgorithm> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): RepositoryHashAlgorithm {
      val jsonDecoder = decoder.requireJsonDecoder("RepositoryHashAlgorithm")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("RepositoryHashAlgorithm must be a JSON object")
      val hashAlgorithm = json.decodeRequired<InlineRepositoryHashAlgorithmHashAlgorithmX7db50032>(rawObject, "hash_algorithm")
      return RepositoryHashAlgorithm(
        hashAlgorithm = hashAlgorithm,
      )
    }

    override fun serialize(encoder: Encoder, `value`: RepositoryHashAlgorithm) {
      val jsonEncoder = encoder.requireJsonEncoder("RepositoryHashAlgorithm")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("hash_algorithm", json.encodeToJsonElement(value.hashAlgorithm))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun repositoryHashAlgorithm(block: RepositoryHashAlgorithm.Builder.() -> Unit): RepositoryHashAlgorithm = RepositoryHashAlgorithm.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("RepositoryHashAlgorithm is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
