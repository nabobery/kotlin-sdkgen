package io.github.nabobery.sdkgen.github.generated

import kotlin.Int
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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1actions~1runners/get/responses/200/content/application~1json/schem
 * a.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1actions~1runners/get/responses/200/content/application~1json/schem
 * a
 */
@Serializable(with = InlineOrgsActionsRunnersGetResponse200JsonX80c02e0d.Serializer::class)
public class InlineOrgsActionsRunnersGetResponse200JsonX80c02e0d(
  runners: List<Runner>,
  public val totalCount: Int,
) {
  public val runners: List<Runner> = runners.toList()

  public class Builder {
    private var runnersValue: List<Runner>? = null

    public var runners: List<Runner>
      get() = requireNotNull(runnersValue) { "runners is required" }.toList()
      set(`value`) {
        runnersValue = value.toList()
      }

    private var totalCountValue: Int? = null

    public var totalCount: Int
      get() = requireNotNull(totalCountValue) { "totalCount is required" }
      set(`value`) {
        totalCountValue = value
      }

    public fun build(): InlineOrgsActionsRunnersGetResponse200JsonX80c02e0d {
      check(runnersValue != null) { "runners is required" }
      check(totalCountValue != null) { "totalCount is required" }
      return InlineOrgsActionsRunnersGetResponse200JsonX80c02e0d(
        runners = runners,
        totalCount = totalCount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsActionsRunnersGetResponse200JsonX80c02e0d = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineOrgsActionsRunnersGetResponse200JsonX80c02e0d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsActionsRunnersGetResponse200JsonX80c02e0d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsActionsRunnersGetResponse200JsonX80c02e0d")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsActionsRunnersGetResponse200JsonX80c02e0d must be a JSON object")
      val runners = json.decodeRequired<List<Runner>>(rawObject, "runners")
      val totalCount = json.decodeRequired<Int>(rawObject, "total_count")
      return InlineOrgsActionsRunnersGetResponse200JsonX80c02e0d(
        runners = runners,
        totalCount = totalCount,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsActionsRunnersGetResponse200JsonX80c02e0d) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsActionsRunnersGetResponse200JsonX80c02e0d")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("runners", json.encodeToJsonElement(value.runners))
        put("total_count", json.encodeToJsonElement(value.totalCount))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsActionsRunnersGetResponse200JsonX80c02e0d(block: InlineOrgsActionsRunnersGetResponse200JsonX80c02e0d.Builder.() -> Unit): InlineOrgsActionsRunnersGetResponse200JsonX80c02e0d = InlineOrgsActionsRunnersGetResponse200JsonX80c02e0d.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOrgsActionsRunnersGetResponse200JsonX80c02e0d is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
