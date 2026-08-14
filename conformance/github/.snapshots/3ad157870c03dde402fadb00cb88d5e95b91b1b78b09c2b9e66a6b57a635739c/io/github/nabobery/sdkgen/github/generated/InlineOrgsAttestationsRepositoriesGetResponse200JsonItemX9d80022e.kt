package io.github.nabobery.sdkgen.github.generated

import kotlin.Int
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
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1attestations~1repositories/get/responses/200/content/application~1
 * json/schema/items.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1attestations~1repositories/get/responses/200/content/application~1
 * json/schema/items
 */
@Serializable(with = InlineOrgsAttestationsRepositoriesGetResponse200JsonItemX9d80022e.Serializer::class)
public class InlineOrgsAttestationsRepositoriesGetResponse200JsonItemX9d80022e(
  public val id: Int? = null,
  public val name: String? = null,
) {
  public class Builder {
    public var id: Int? = null

    public var name: String? = null

    public fun build(): InlineOrgsAttestationsRepositoriesGetResponse200JsonItemX9d80022e = InlineOrgsAttestationsRepositoriesGetResponse200JsonItemX9d80022e(
      id = id,
      name = name,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsAttestationsRepositoriesGetResponse200JsonItemX9d80022e = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineOrgsAttestationsRepositoriesGetResponse200JsonItemX9d80022e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsAttestationsRepositoriesGetResponse200JsonItemX9d80022e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsAttestationsRepositoriesGetResponse200JsonItemX9d80022e")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsAttestationsRepositoriesGetResponse200JsonItemX9d80022e must be a JSON object")
      return InlineOrgsAttestationsRepositoriesGetResponse200JsonItemX9d80022e(
        id = rawObject["id"]?.let { json.decodeFromJsonElement<Int>(it) },
        name = rawObject["name"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsAttestationsRepositoriesGetResponse200JsonItemX9d80022e) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsAttestationsRepositoriesGetResponse200JsonItemX9d80022e")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.id?.let { put("id", json.encodeToJsonElement(it)) }
        value.name?.let { put("name", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsAttestationsRepositoriesGetResponse200JsonItemX9d80022e(block: InlineOrgsAttestationsRepositoriesGetResponse200JsonItemX9d80022e.Builder.() -> Unit): InlineOrgsAttestationsRepositoriesGetResponse200JsonItemX9d80022e = InlineOrgsAttestationsRepositoriesGetResponse200JsonItemX9d80022e.build(block)
