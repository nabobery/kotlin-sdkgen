package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * The status of the code search index for this repository
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/nullable-repository/properties/code_search_index_status
 */
@Serializable(with = InlineNullableRepositoryCodeSearchIndexStatusX4ec4110c.Serializer::class)
public class InlineNullableRepositoryCodeSearchIndexStatusX4ec4110c(
  public val lexicalCommitSha: String? = null,
  public val lexicalSearchOk: Boolean? = null,
) {
  public class Builder {
    public var lexicalCommitSha: String? = null

    public var lexicalSearchOk: Boolean? = null

    public fun build(): InlineNullableRepositoryCodeSearchIndexStatusX4ec4110c = InlineNullableRepositoryCodeSearchIndexStatusX4ec4110c(
      lexicalCommitSha = lexicalCommitSha,
      lexicalSearchOk = lexicalSearchOk,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineNullableRepositoryCodeSearchIndexStatusX4ec4110c = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineNullableRepositoryCodeSearchIndexStatusX4ec4110c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineNullableRepositoryCodeSearchIndexStatusX4ec4110c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineNullableRepositoryCodeSearchIndexStatusX4ec4110c")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineNullableRepositoryCodeSearchIndexStatusX4ec4110c must be a JSON object")
      return InlineNullableRepositoryCodeSearchIndexStatusX4ec4110c(
        lexicalCommitSha = rawObject["lexical_commit_sha"]?.let { json.decodeFromJsonElement<String>(it) },
        lexicalSearchOk = rawObject["lexical_search_ok"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineNullableRepositoryCodeSearchIndexStatusX4ec4110c) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineNullableRepositoryCodeSearchIndexStatusX4ec4110c")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.lexicalCommitSha?.let { put("lexical_commit_sha", it) }
        value.lexicalSearchOk?.let { put("lexical_search_ok", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineNullableRepositoryCodeSearchIndexStatusX4ec4110c(block: InlineNullableRepositoryCodeSearchIndexStatusX4ec4110c.Builder.() -> Unit): InlineNullableRepositoryCodeSearchIndexStatusX4ec4110c = InlineNullableRepositoryCodeSearchIndexStatusX4ec4110c.build(block)
