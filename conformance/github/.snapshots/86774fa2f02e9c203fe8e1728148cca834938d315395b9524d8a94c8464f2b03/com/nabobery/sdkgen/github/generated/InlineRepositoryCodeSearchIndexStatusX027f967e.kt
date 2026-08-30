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
 * Source: sdkgen://source/openapi.yaml#/components/schemas/repository/properties/code_search_index_status
 */
@Serializable(with = InlineRepositoryCodeSearchIndexStatusX027f967e.Serializer::class)
public class InlineRepositoryCodeSearchIndexStatusX027f967e(
  public val lexicalCommitSha: String? = null,
  public val lexicalSearchOk: Boolean? = null,
) {
  public class Builder {
    public var lexicalCommitSha: String? = null

    public var lexicalSearchOk: Boolean? = null

    public fun build(): InlineRepositoryCodeSearchIndexStatusX027f967e = InlineRepositoryCodeSearchIndexStatusX027f967e(
      lexicalCommitSha = lexicalCommitSha,
      lexicalSearchOk = lexicalSearchOk,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineRepositoryCodeSearchIndexStatusX027f967e = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineRepositoryCodeSearchIndexStatusX027f967e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineRepositoryCodeSearchIndexStatusX027f967e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineRepositoryCodeSearchIndexStatusX027f967e")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineRepositoryCodeSearchIndexStatusX027f967e must be a JSON object")
      return InlineRepositoryCodeSearchIndexStatusX027f967e(
        lexicalCommitSha = rawObject["lexical_commit_sha"]?.let { json.decodeFromJsonElement<String>(it) },
        lexicalSearchOk = rawObject["lexical_search_ok"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineRepositoryCodeSearchIndexStatusX027f967e) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineRepositoryCodeSearchIndexStatusX027f967e")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.lexicalCommitSha?.let { put("lexical_commit_sha", it) }
        value.lexicalSearchOk?.let { put("lexical_search_ok", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineRepositoryCodeSearchIndexStatusX027f967e(block: InlineRepositoryCodeSearchIndexStatusX027f967e.Builder.() -> Unit): InlineRepositoryCodeSearchIndexStatusX027f967e = InlineRepositoryCodeSearchIndexStatusX027f967e.build(block)
