package com.nabobery.sdkgen.generated.stripe

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
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/individual/properties/relationship.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/individual/properties/relationship
 */
@Serializable(with = InlineV1AccountsPostRequestFormIndividualRelationshipX76dece08.Serializer::class)
public class InlineV1AccountsPostRequestFormIndividualRelationshipX76dece08(
    public val director: Boolean? = null,
    public val executive: Boolean? = null,
    public val owner: Boolean? = null,
    public val percentOwnership: InlineV1AccountsPostRequestFormIndividualRelationshipPercentOwnershipX9e04d398? = null,
    public val title: String? = null,
) {
    public class Builder {
        public var director: Boolean? = null

        public var executive: Boolean? = null

        public var owner: Boolean? = null

        public var percentOwnership:
            InlineV1AccountsPostRequestFormIndividualRelationshipPercentOwnershipX9e04d398? = null

        public var title: String? = null

        public fun build(): InlineV1AccountsPostRequestFormIndividualRelationshipX76dece08 =
            InlineV1AccountsPostRequestFormIndividualRelationshipX76dece08(
                director = director,
                executive = executive,
                owner = owner,
                percentOwnership = percentOwnership,
                title = title,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1AccountsPostRequestFormIndividualRelationshipX76dece08 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1AccountsPostRequestFormIndividualRelationshipX76dece08> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1AccountsPostRequestFormIndividualRelationshipX76dece08 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1AccountsPostRequestFormIndividualRelationshipX76dece08",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1AccountsPostRequestFormIndividualRelationshipX76dece08 must be a JSON object",
                    )
            return InlineV1AccountsPostRequestFormIndividualRelationshipX76dece08(
                director = rawObject["director"]?.let { json.decodeFromJsonElement<Boolean>(it) },
                executive = rawObject["executive"]?.let { json.decodeFromJsonElement<Boolean>(it) },
                owner = rawObject["owner"]?.let { json.decodeFromJsonElement<Boolean>(it) },
                percentOwnership =
                    rawObject["percent_ownership"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1AccountsPostRequestFormIndividualRelationshipPercentOwnershipX9e04d398>(
                                it,
                            )
                    },
                title = rawObject["title"]?.let { json.decodeFromJsonElement<String>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1AccountsPostRequestFormIndividualRelationshipX76dece08,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1AccountsPostRequestFormIndividualRelationshipX76dece08",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.director?.let { put("director", json.encodeToJsonElement(it)) }
                    value.executive?.let { put("executive", json.encodeToJsonElement(it)) }
                    value.owner?.let { put("owner", json.encodeToJsonElement(it)) }
                    value.percentOwnership?.let { put("percent_ownership", json.encodeToJsonElement(it)) }
                    value.title?.let { put("title", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1AccountsPostRequestFormIndividualRelationshipX76dece08(
    block: InlineV1AccountsPostRequestFormIndividualRelationshipX76dece08.Builder.() -> Unit,
): InlineV1AccountsPostRequestFormIndividualRelationshipX76dece08 =
    InlineV1AccountsPostRequestFormIndividualRelationshipX76dece08.build(block)
