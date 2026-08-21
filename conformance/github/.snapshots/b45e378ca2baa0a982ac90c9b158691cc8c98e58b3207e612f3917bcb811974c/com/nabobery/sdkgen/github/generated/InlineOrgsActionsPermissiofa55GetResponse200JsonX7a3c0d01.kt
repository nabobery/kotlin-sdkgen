package com.nabobery.sdkgen.github.generated

import kotlin.Int
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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1actions~1permissions~1self-hosted-runners~1repositories/get/respon
 * ses/200/content/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1actions~1permissions~1self-hosted-runners~1repositories/get/respon
 * ses/200/content/application~1json/schema
 */
@Serializable(with = InlineOrgsActionsPermissiofa55GetResponse200JsonX7a3c0d01.Serializer::class)
public class InlineOrgsActionsPermissiofa55GetResponse200JsonX7a3c0d01(
  repositories: List<Repository>? = null,
  public val totalCount: Int? = null,
) {
  public val repositories: List<Repository>? =
      repositories?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var repositoriesValue: List<Repository>? = null

    public var repositories: List<Repository>?
      get() = repositoriesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        repositoriesValue = value?.let { collection0 -> collection0.toList() }
      }

    public var totalCount: Int? = null

    public fun build(): InlineOrgsActionsPermissiofa55GetResponse200JsonX7a3c0d01 = InlineOrgsActionsPermissiofa55GetResponse200JsonX7a3c0d01(
      repositories = repositories,
      totalCount = totalCount,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsActionsPermissiofa55GetResponse200JsonX7a3c0d01 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineOrgsActionsPermissiofa55GetResponse200JsonX7a3c0d01> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsActionsPermissiofa55GetResponse200JsonX7a3c0d01 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsActionsPermissiofa55GetResponse200JsonX7a3c0d01")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsActionsPermissiofa55GetResponse200JsonX7a3c0d01 must be a JSON object")
      return InlineOrgsActionsPermissiofa55GetResponse200JsonX7a3c0d01(
        repositories = rawObject["repositories"]?.let { json.decodeFromJsonElement<List<Repository>>(it) },
        totalCount = rawObject["total_count"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsActionsPermissiofa55GetResponse200JsonX7a3c0d01) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsActionsPermissiofa55GetResponse200JsonX7a3c0d01")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.repositories?.let { put("repositories", json.encodeToJsonElement(it)) }
        value.totalCount?.let { put("total_count", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsActionsPermissiofa55GetResponse200JsonX7a3c0d01(block: InlineOrgsActionsPermissiofa55GetResponse200JsonX7a3c0d01.Builder.() -> Unit): InlineOrgsActionsPermissiofa55GetResponse200JsonX7a3c0d01 = InlineOrgsActionsPermissiofa55GetResponse200JsonX7a3c0d01.build(block)
