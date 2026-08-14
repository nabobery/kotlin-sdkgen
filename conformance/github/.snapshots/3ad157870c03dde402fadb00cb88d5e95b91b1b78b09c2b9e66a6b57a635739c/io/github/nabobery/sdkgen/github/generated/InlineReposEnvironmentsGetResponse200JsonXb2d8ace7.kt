package io.github.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1environments/get/responses/200/content/application~1jso
 * n/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1environments/get/responses/200/content/application~1jso
 * n/schema
 */
@Serializable(with = InlineReposEnvironmentsGetResponse200JsonXb2d8ace7.Serializer::class)
public class InlineReposEnvironmentsGetResponse200JsonXb2d8ace7(
  environments: List<Environment>? = null,
  /**
   * The number of environments in this repository
   */
  public val totalCount: Int? = null,
) {
  public val environments: List<Environment>? =
      environments?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var environmentsValue: List<Environment>? = null

    public var environments: List<Environment>?
      get() = environmentsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        environmentsValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * The number of environments in this repository
     */
    public var totalCount: Int? = null

    public fun build(): InlineReposEnvironmentsGetResponse200JsonXb2d8ace7 = InlineReposEnvironmentsGetResponse200JsonXb2d8ace7(
      environments = environments,
      totalCount = totalCount,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposEnvironmentsGetResponse200JsonXb2d8ace7 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReposEnvironmentsGetResponse200JsonXb2d8ace7> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposEnvironmentsGetResponse200JsonXb2d8ace7 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposEnvironmentsGetResponse200JsonXb2d8ace7")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposEnvironmentsGetResponse200JsonXb2d8ace7 must be a JSON object")
      return InlineReposEnvironmentsGetResponse200JsonXb2d8ace7(
        environments = rawObject["environments"]?.let { json.decodeFromJsonElement<List<Environment>>(it) },
        totalCount = rawObject["total_count"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposEnvironmentsGetResponse200JsonXb2d8ace7) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposEnvironmentsGetResponse200JsonXb2d8ace7")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.environments?.let { put("environments", json.encodeToJsonElement(it)) }
        value.totalCount?.let { put("total_count", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposEnvironmentsGetResponse200JsonXb2d8ace7(block: InlineReposEnvironmentsGetResponse200JsonXb2d8ace7.Builder.() -> Unit): InlineReposEnvironmentsGetResponse200JsonXb2d8ace7 = InlineReposEnvironmentsGetResponse200JsonXb2d8ace7.build(block)
